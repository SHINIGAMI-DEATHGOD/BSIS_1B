package STEP_BY_STEP_PROCEDURE;

import java.time.LocalDateTime;

import java.text.DecimalFormat; 

import javax.swing.JOptionPane; 

public class STEP_4 { // CLASS START 

	public static void main(String[] args) { // MAIN METHOD START
		
	/*	// declare variables TO CALL OUT LATER
				DecimalFormat df = new DecimalFormat("0.00"); // LIMITS DECIMAL FORMAT TO ONLY 2
				String gname = "\u001B[1m                G5's STATIONARY STORE\u001B[0m"; // bold group name - centered
				LocalDateTime now = LocalDateTime.now(); // for auto updated date and time */
		
		
		
		
		
		
		

	} // MAIN METHOD END [11]
	
//=======================================================================================================================================
	
	
	public static int p () {
		 return  JOptionPane.showConfirmDialog(null,"---------------WELCOME TO---------------\n"
				 +"         G5's STATIONARY STORE"+"\n"+"--------------------------------------------------"+"\n"
				 +"                    Proceed?","Welcome", JOptionPane.YES_NO_OPTION) ;}
	
	
    public static String Id () {
		 return JOptionPane.showInputDialog("CASHIER ID: ");}
    
 
    public static String ItemName () {
		 return JOptionPane.showInputDialog(null,       "CODE\n"+
			                                            "[001] PEN\n"+
						                                "[002] PENCIL\n"+
			                                            "[003] ERASER\n"+
						                                "[004] RULER\n"+
			                                            "[005] SHARPENER\n"+
						                                "[006] PENCIL CASE\n"+
			                                            "[007] CRAYON1(8)\n"+
						                                "[008] CRAYON2 (12)\n"+
			                                            "[009] NOTEBOOK\n"+
						                                "[010] SCISSORS\n");}
    
    public static int Q () {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTITY\n"+
	                                                              "ENTER ITEM COUNT:"));}
		
			
		 

} // CLASS END [9]
