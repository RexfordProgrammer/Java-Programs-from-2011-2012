import javax.swing.JOptionPane;

public class Moneycalc {
	public static void main ( String args[] ) {
	
	
	String AmountOfMoney1 = JOptionPane.showInputDialog("Amount of money:");
	double AmountOfMoney = Double.parseDouble(AmountOfMoney1);
	double OneHundredDollarNum = (AmountOfMoney - (AmountOfMoney % 100))/100;                                                                    
	double OneHundredDollarNumLeftover = AmountOfMoney - (100 * OneHundredDollarNum);
	double FiftyDollarNum = ((OneHundredDollarNumLeftover - (OneHundredDollarNumLeftover % 50))/50);
	double FiftyDollarNumLeftover =  AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum));
	double TwentyDollarNum = ((FiftyDollarNumLeftover - (FiftyDollarNumLeftover % 20))/20);
	double TwentyDollarNumLeftover =  AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum));
	double TenDollarNum = ((TwentyDollarNumLeftover - (TwentyDollarNumLeftover % 10))/10);
	double TenDollarNumLeftover = AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum));
	double FiveDollarNum = ((TenDollarNumLeftover - (TenDollarNumLeftover % 5))/5);
	double FiveDollarNumLeftover =  AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum) + (5 * FiveDollarNum));
	double OneDollarNum = ((FiveDollarNumLeftover - (FiveDollarNumLeftover % 1))/1);
	double OneDollarNumLeftover =  AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum) + (5 * FiveDollarNum) + (1 * OneDollarNum));
	double QuarterNum = ((OneDollarNumLeftover - (OneDollarNumLeftover % .25 ))/.25);
	double QuarterNumLeftover =  AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum) + (5 * FiveDollarNum) + (1 * OneDollarNum) + (.25 * QuarterNum));
	double DimeNum = ((QuarterNumLeftover - (QuarterNumLeftover % .10 ))/.10);
	double DimeNumLeftover = AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum) + (5 * FiveDollarNum) + (1 * OneDollarNum) + (.25 * QuarterNum) + (.10 * DimeNum));
	double NickelNum = ((DimeNumLeftover - (DimeNumLeftover % .05 ))/.05);
	double NikelNumLeftover = AmountOfMoney - ((100 * OneHundredDollarNum) + (50 * FiftyDollarNum) + (20 * TwentyDollarNum) + (10 * TenDollarNum) + (5 * FiveDollarNum) + (1 * OneDollarNum) + (.25 * QuarterNum) + (.10 * DimeNum) + (.05 * DimeNum));
	double PenniesNum = ((NikelNumLeftover - (NikelNumLeftover % .01 ))/.01);
	
	if (OneHundredDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of one hundred dollar bills needed: " + OneHundredDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (OneHundredDollarNum == 0){
	}
	
	if (FiftyDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of fifty dollar bills needed: " + FiftyDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (OneHundredDollarNum == 0){
	}
	
	if (TwentyDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of twenty dollar bills needed: " + TwentyDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (OneHundredDollarNum == 0){
	}
	
	if (TenDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of ten dollar bills needed: " + TenDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (TenDollarNum == 0){
	}
	
	if (FiveDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of five dollar bills needed: " + FiveDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (FiveDollarNum == 0){
	}
	
	if (OneDollarNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of one dollar bills needed: " + OneDollarNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (OneDollarNum == 0){
	}
	
	if (QuarterNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of quarters needed: " + QuarterNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (QuarterNum == 0){
	}
	
	if (DimeNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of dimes needed: " + DimeNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (DimeNum == 0){
	}
	
	if (NickelNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of Nickels needed: " + NickelNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (NickelNum == 0){
	}
	
	if (PenniesNum > 0){
	JOptionPane.showMessageDialog(null, "Number Of pennies needed: " + PenniesNum, "Change Calculator", JOptionPane.PLAIN_MESSAGE);// This is the script that shows the results 
	}else if (PenniesNum == 0){
	}
	
	}
}
