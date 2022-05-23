import javax.swing.*;
import java.awt.*;

public class JCheckBoxTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        JCheckBox jCheckBox1=new JCheckBox("睡觉",true);
        JCheckBox jCheckBox2=new JCheckBox("吃饭",false);
        JCheckBox jCheckBox3=new JCheckBox("打游戏",false);
        jf.add(jCheckBox1);
        jf.add(jCheckBox2);
        jf.add(jCheckBox3);

    }
}
