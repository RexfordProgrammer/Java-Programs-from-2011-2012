import javax.swing.JOptionPane;
import java.lang.Math;

public class Triangle {
	public static void main ( String args[] ) {
		
		String[] options = {"One leg and Hypotenuse", "Both legs to get the Hypotenuse","Cancel"};
		int n = 
		JOptionPane.showOptionDialog(null,
		"Would you like to calculate one of the triangles two legs, or would you like to use both legs to get the Hypotenuse",
		"Triangle calculator",
		JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE,
		null,
		options,
		options[0]);
		
		if (n == 0) { //One leg and Hypotenuse
		String HYPOTENUSE = JOptionPane.showInputDialog("Hypotenuse:");
		String LEG1 = JOptionPane.showInputDialog("Longer or Shorter Leg:");
			
		double Hypotenuse = Double.parseDouble(HYPOTENUSE);
		double Leg1 = Double.parseDouble(LEG1);
		double Leg2 = Hypotenuse * Hypotenuse - Leg1 * Leg1;
		JOptionPane.showMessageDialog(null, "Longer or Shorter Leg: " + Math.sqrt(Leg2), "Calculator", JOptionPane.PLAIN_MESSAGE);	
		
		
		
		} else if (n == 1) { //Both legs to get the Hypotenuse
		String Leg1 = JOptionPane.showInputDialog("Longer leg:");
		String Leg2 = JOptionPane.showInputDialog("Shorter leg:");
			
		double LEG1 = Double.parseDouble(Leg1); //Variable For the first leg
		double LEG2 = Double.parseDouble(Leg2); //Variable For the second leg
		double Hypotenuse = LEG1*LEG1 + LEG2*LEG2;
			
		JOptionPane.showMessageDialog(null, "Hypotenuse of triangle times itself: " + Hypotenuse, "Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
		JOptionPane.showMessageDialog(null, "Hypotenuse of triangle: " + Math.sqrt(Hypotenuse), "Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
        }else if (n == 2){
        	
        }
		
		
	}
}
