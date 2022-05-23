import javax.swing.*;
import java.awt.*;

public class JComboBoxTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JFram");
        jf.setBounds(300,300,400,500);
        jf.setLayout(new FlowLayout());
        JComboBox jComboBox=new JComboBox();
        jComboBox.addItem("请选择学历");
        jComboBox.addItem("高中");
        jComboBox.addItem("大学");
        jComboBox.addItem("研究生");
        jComboBox.setSize(100,200);
        jf.add(jComboBox);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
