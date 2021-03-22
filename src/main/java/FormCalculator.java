import javax.swing.*;

public class FormCalculator extends JFrame{
    private JPanel panel1 = new JPanel();

    private JLabel lblNum1 = new JLabel("Number One");
    private JLabel lblNum2 = new JLabel("Number Two");
    public JTextField textField1 = new JTextField(3);
    public JTextField textField2 = new JTextField(3);
    public JButton btnResult = new JButton("Calculator");

    public JLabel resultSume = new JLabel();
    public JLabel resultRest = new JLabel();
    public JLabel resultMultiplication = new JLabel();
    public JLabel resultDivision = new JLabel();
    private static FormCalculator formCalculator;
    
    public static FormCalculator getInstance(){
        if (null == formCalculator){
            formCalculator = new FormCalculator();
        }
        return formCalculator;
    }

    public FormCalculator(){
        createLayout();

        this.add(panel1);
        this.setSize(300, 250);
        this.setTitle("Basic Calculator");
        //this.add(panel1);
    }

    private void createLayout(){
        GroupLayout pnlLayout = new GroupLayout(panel1);
        panel1.setLayout(pnlLayout);
        pnlLayout.setAutoCreateGaps(true);
        pnlLayout.setHorizontalGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(5)
                                .addComponent(lblNum1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(5)
                                .addComponent(lblNum2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        )
                        .addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultSume, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultRest, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultMultiplication, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultDivision, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                ));


        pnlLayout.setVerticalGroup(pnlLayout.createSequentialGroup()
                .addGap(10)
                .addGroup(pnlLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(lblNum1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(pnlLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(lblNum2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                )
                .addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(resultSume, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(resultRest, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(resultMultiplication, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(resultDivision, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        );
    }
}
