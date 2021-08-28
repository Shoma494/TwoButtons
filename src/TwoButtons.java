import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui =new TwoButtons();
        gui.go();


    }

    private void go() {
        frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton =new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton =new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm label");
        MyDrawPanel myDrawPanel=new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);




        frame.setSize(700, 700);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
          label.setText("Oach");

        }
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            frame.repaint();

        }
    }
}
