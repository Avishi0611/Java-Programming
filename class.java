import java.util.Scanner;
class Lamp{
    Boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("Light on?" +isOn);

    }
    void turnOff(){
        isOn=true;
        System.out.println("Light off?" +isOn);
        
    }

}
class Main{
    public static void main(String[] args) {
        Lamp led=new Lamp();
        led.turnOn();
        led.turnOff();
    }
}