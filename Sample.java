import java.awt.*;
import java.applet.*;
 /*<applet width="500" height="'890" code="'Sample"></applet>*/

public class Sample extends Applet{
    String msg;
       

   public void init(){
         setBackground(Color.cyan);
        setForeground(Color.red);
        msg="Inside init()--";

    }
   public void start(){
        msg+="Inside start()--";


    }
   public void paint(Graphics g){
        msg+="inside paint()-";
        g.drawString(msg,20,30);
       
    }
}   
