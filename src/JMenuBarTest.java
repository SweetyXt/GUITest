import javax.swing.*;
import java.awt.*;

public class JMenuBarTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,400,500);

        JMenuBar jmb=new JMenuBar();
        JMenu jMenu1=new JMenu("菜单一");
        JMenuItem jMenuItem1=new JMenuItem("选项1");
        JMenuItem jMenuItem2=new JMenuItem("选项2");
        JMenuItem jMenuItem3=new JMenuItem("选项3");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jmb.add(jMenu1);
        jf.add(jmb);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));


    }
}
