import javax.swing.JOptionPane;


/*As this code was written by a 12 year old, I have taken the liberty of correcting the
 * indentation. However, I leave all the other egregious errors for all to see, as I
 * believe it adds to the authenticity of the thing. Or, perhaps, I have a strange sense
 * of humor. 
 * There are several other examples of code like this one, one that uses the
 * console as a way to input your age, and if it is over or equal to 21, then it proclaims 
 * "Then you're old!" and exits. Though I find it funny, I have omitted that file as it is not
 * as effective a demonstration of my 12 year old abilities, funny as it may be from my "old"
 * perspective. I will include it on my github.
 */
public class CircleCalculator {
	public static void main(String[] args){
		String[] ButtonTitles = new String[] {"Yes", "No"};//Yes = 0 No = 1
		int a = 
				JOptionPane.showOptionDialog(null,
						"Would you like to start the circle calculator?",
						"Circle Calculator",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,
						null,
						ButtonTitles,
						ButtonTitles[0]);
		if (a == 0){//Run statement
			String[] options = new String[] {"Area", "Circumfrence", "Diameter", "Chord"};
			// Area = 0 Circumfrence = 1 Diameter = 2 Chord = 3

			/*  
			 *  Yes I am fully aware that that 12 year old Rexford committed
			 *  a cardinal sin by naming these two variables these things,
			 *  but i'll cut him some slack for his age.
			 */
			String RadiuS = JOptionPane.showInputDialog(null,"Enter the radius of the circle you want to calculate: ",0);
			Double Radius = Double.parseDouble(RadiuS);
			//I am also aware of the fact 12 year old me struggled to spell "Measurement"
			//I can assure you (Reader, whomever you may be) I have come a long way in 
			//this respect.
			int n = 
					JOptionPane.showOptionDialog(null,
							"Choose a mesurement",
							"Circle Calculator",
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE,
							null,
							options,
							options[0]);

			double chord = Radius * Radius + Radius * Radius; 

			//Again, please ignore the spelling errors, I am not certain why I
			//did not correct them.
			//As to the third option, I have no idea what exactly I was attempting to calculate,
			//Perhaps it was experimental, your guess is a good as mine, perhaps it was something
			//I needed for a homework assignment, like the rest, but the usefulness I have no idea.
			//I figured I would leave it in for the odd novelty of it. 
			if (n == 0) { //option 0
				JOptionPane.showMessageDialog(null, "Area: " + Radius * Radius * 3.14159, "Calculator", JOptionPane.PLAIN_MESSAGE);
			} else if (n == 1) { //option one
				JOptionPane.showMessageDialog(null, "Circumfrence: " + (Radius * 2 * 3.14159), "Calculator", JOptionPane.PLAIN_MESSAGE);
			// This is the script that shows the results 	
			} else if (n == 2) { //option 2
				JOptionPane.showMessageDialog(null, "Diameter: " + Radius * 2, "Calculator", JOptionPane.PLAIN_MESSAGE);
			} else if (n == 3) { //optoion 3
				JOptionPane.showMessageDialog(null, "This Chord is the 45°,45°,90° Chord: " + chord, "Calculator", JOptionPane.PLAIN_MESSAGE);
			}

		} else if (a == 1) {// Cancel statement

		}

	}

}
