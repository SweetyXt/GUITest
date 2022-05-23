import javax.swing.*;
public class JFRAMtest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("测试框");
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setTitle("这里是一个测试");
        jf.setLocation(500,500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
