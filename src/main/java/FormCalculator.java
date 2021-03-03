import javax.swing.*;

public class FormCalculator extends JFrame{
    private JPanel panel1 = new JPanel();

    private JLabel lblNum1 = new JLabel("Number One");
    private JLabel lblNum2 = new JLabel("Number Two");
    private JTextField textField1 = new JTextField(3);
    private JTextField textField2 = new JTextField(3);
    private JButton btnResult = new JButton("Calculator");

    private JLabel result = new JLabel();

    public FormCalculator(){
        panel1.add(lblNum1);
        panel1.add(textField1);
        panel1.add(lblNum2);
        panel1.add(textField2);
        panel1.add(btnResult);
        panel1.add(result);

        this.add(panel1);
        this.setSize(500, 200);
        this.setTitle("Basic Calculator");
        //this.add(panel1);
    }
}
