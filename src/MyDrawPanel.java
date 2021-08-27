import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D=(Graphics2D) g;


        int red = (int) (Math.random()*255);
        int green =(int) (Math.random()*255);
        int blue =(int) (Math.random()*255);
        Color randomColor1 =new Color(red, green, blue);

        red = (int) (Math.random()*255);
        green =(int) (Math.random()*255);
        blue =(int) (Math.random()*255);
        Color randomColor2 =new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(this.getX(),this.getY(),randomColor2,this.getX()+this.getWidth(),this.getY()+this.getHeight(),randomColor1);




        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(0,0,this.getWidth(),this.getHeight());


    }
}
