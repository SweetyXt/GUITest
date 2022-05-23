import javax.swing.*;
public class JDialogTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("test");
        jf.setBounds(200,200,300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JDialog jd=new JDialog(jf,"title");
        jd.setBounds(200,300,200,300);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
