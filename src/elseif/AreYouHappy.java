package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	 
	String H = JOptionPane.showInputDialog("Are you happy?");
	if(H.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
	}
	else {
		H =JOptionPane.showInputDialog("Do you want to be happy?");
		if(H.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
}
