import javax.swing.*;
public class JLabelTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,600,800);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jl=new JLabel("账号",SwingConstants.CENTER);
        jf.add(jl);
    }
}
