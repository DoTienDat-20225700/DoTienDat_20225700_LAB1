import javax.swing.JOptionPane;
public class Calculate{
	public static void main (String[] args){
	String strnum1, strnum2;
	strnum1 = JOptionPane.showInputDialog(null, "please input the 1st number: ", "input the 1st number", JOptionPane.INFORMATION_MESSAGE);
	strnum2 = JOptionPane.showInputDialog(null, "please input the 2nd number: ", "input the 2nd number", JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strnum1);
	double num2 = Double.parseDouble(strnum2);
	double sum = num1 + num2;
	double minus = num1 - num2;
	double multi = num1 * num2;
	if (num2 != 0) {
		double div = num1 / num2;
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println(div);
}
	else {
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println("Cannot divide by zero");
}
}
}