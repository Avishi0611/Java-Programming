#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define BUFFER_SIZE 5

int buffer[BUFFER_SIZE];
int in = 0, out = 0;

sem_t empty;  // semaphore for empty slots
sem_t full;   // semaphore for filled slots
pthread_mutex_t mutex; // for mutual exclusion

void *producer(void *pno) {
    int item;
    for(int i = 0; i < 5; i++) {
        item = rand() % 100; // produce an item
        sem_wait(&empty);     // wait if buffer is full
        pthread_mutex_lock(&mutex); // enter critical section

        buffer[in] = item;
        printf("Producer %d: Insert Item %d at %d\n", *((int *)pno), item, in);
        in = (in + 1) % BUFFER_SIZE;

        pthread_mutex_unlock(&mutex);
        sem_post(&full);      // signal that buffer has new item
        sleep(1);
    }
}

void *consumer(void *cno) {
    for(int i = 0; i < 5; i++) {
        sem_wait(&full);      // wait if buffer is empty
        pthread_mutex_lock(&mutex); // enter critical section

        int item = buffer[out];
        printf("Consumer %d: Remove Item %d from %d\n", *((int *)cno), item, out);
        out = (out + 1) % BUFFER_SIZE;

        pthread_mutex_unlock(&mutex);
        sem_post(&empty);     // signal that a slot is empty
        sleep(1);
    }
}

int main() {
    pthread_t pro[3], con[3];
    int a[3] = {1,2,3};

    sem_init(&empty, 0, BUFFER_SIZE);
    sem_init(&full, 0, 0);
    pthread_mutex_init(&mutex, NULL);

    for(int i = 0; i < 3; i++) {
        pthread_create(&pro[i], NULL, (void *)producer, (void *)&a[i]);
        pthread_create(&con[i], NULL, (void *)consumer, (void *)&a[i]);
    }

    for(int i = 0; i < 3; i++) {
        pthread_join(pro[i], NULL);
        pthread_join(con[i], NULL);
    }

    pthread_mutex_destroy(&mutex);
    sem_destroy(&empty);
    sem_destroy(&full);
    return 0;
}
