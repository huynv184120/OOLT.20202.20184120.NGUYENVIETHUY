package Lab01;

import javax.swing.JOptionPane;

public class Caculate{
    public static void main(String[] args){
        String a, b;
        a = JOptionPane.showInputDialog(null, "Please input the first number: ",
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Please input the second number: ",
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);

        double t = num1 + num2;
        double Tich = num1 * num2;
        double h = num1 - num2;
        double Thuong = num1/num2;

        JOptionPane.showMessageDialog(null, "tong la "+ t);
        JOptionPane.showMessageDialog(null, "hieu la "+ h);
        JOptionPane.showMessageDialog(null, "Tich la "+ Tich);
        JOptionPane.showMessageDialog(null, "Thuong la "+ Thuong);
        System.exit(0);
    }
}