import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class ControllerCalculator {
    FormCalculator formCalculator;

    public ControllerCalculator(){
        formCalculator = FormCalculator.getInstance();
        initController();
    }

    private void initController(){
        formCalculator.setVisible(true);
        formCalculator.btnResult.addActionListener(this::btnCalculate);
    }

    private void btnCalculate(ActionEvent e) {
        int num1 = Integer.parseInt(formCalculator.textField1.getText());
        int num2 = Integer.parseInt(formCalculator.textField2.getText());

        formCalculator.resultSume.setText("The Sume is: " + new Sume().operation(num1, num2));
        formCalculator.resultRest.setText("The Rest is: " + new Rest().operation(num1, num2));
        formCalculator.resultMultiplication.setText("The Multiplication is: " + new Multiplication().operation(num1, num2));
    }
}
