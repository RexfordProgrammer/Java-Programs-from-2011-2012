import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args){
	String[] ButtonTitles = new String[] {"Yes", "No"};//Yes = 0 No = 1
		float YN =
		JOptionPane.showOptionDialog(null, "Start?", "Name:", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ButtonTitles, ButtonTitles[0]);//Start Buttion two selection 
			
		if(YN == 0){
			String Name = JOptionPane.showInputDialog(null,"Your name: ","Rex Dorchester");//JOptionPane IMPUT
			JOptionPane.showMessageDialog(null, "Hello, " + Name, "Hello, " + Name, JOptionPane.PLAIN_MESSAGE);// This is the script that shows a result or variable as far as a math problem
			}else if (YN == 1) {
				
		}
	}
}