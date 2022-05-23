import javax.swing.*;
import java.awt.*;

public class JRadioButtonTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        JRadioButton jrb=new JRadioButton("男");
        JRadioButton jrb2=new JRadioButton("女");
        ButtonGroup bg=new ButtonGroup();
        bg.add(jrb);
        bg.add(jrb2);
        jf.add(jrb);
        jf.add(jrb2);
    }
}
