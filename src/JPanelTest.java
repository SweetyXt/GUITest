import javax.swing.*;
import java.awt.*;

public class JPanelTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,1000,1500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jb1=new JButton("香蕉");
        JButton jb2=new JButton("苹果");
        JPanel jp=new JPanel(new FlowLayout());
        jp.add(jb1);
        jp.add(jb2);
        jf.add(jp);
        JScrollPane js=new JScrollPane(jf);
        js.setBounds(200,300,400,600);
        js.add(jp);

    }
}
