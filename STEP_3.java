package STEP_BY_STEP_PROCEDURE;

import java.time.LocalDateTime; 

import java.text.DecimalFormat;

import javax.swing.JOptionPane; 

public class STEP_3 { // CLASS START

	public static void main(String[] args) { // MAIN METHOD START
		

	} // MAIN METHOD END [11]	

// ==============================================================================================================================================
	// STEP 3 IS TO SEPARATE MAIN METHOD AND SUB METHOD
	// BTW I USED SUB METHOD PARA MAS MALINIS CODE
	
	// === method 1 for intro
	public static int p () {
		 return  JOptionPane.showConfirmDialog(null,"---------------WELCOME TO---------------\n"
				 +"         G5's STATIONARY STORE"+"\n"+"--------------------------------------------------"+"\n"
				 +"                    Proceed?","Welcome", JOptionPane.YES_NO_OPTION) ;}
	
	// === method 2 for when entering cashier ID 	 
    public static String Id () {
		 return JOptionPane.showInputDialog("CASHIER ID: ");}
    
	// === method 3 to show and input Item ID	 
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
    
    // === method 4 to ask how many items to buy
    public static int Q () {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTITY\n"+
	                                                              "ENTER ITEM COUNT:"));}
		
			
		 
	
	
	
	

} // CLASS END [9]
