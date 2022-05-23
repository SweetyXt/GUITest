import javax.swing.*;
import java.awt.*;

public class JButtonTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        JButton jb1=new JButton("按钮1");
        JButton jb2=new JButton("222");
        jb1.setToolTipText("这里是提示文字");
        jb2.setBorderPainted(false);
        jb1.setEnabled(true);
        jf.add(jb1);
        jf.add(jb2);
    }
}
