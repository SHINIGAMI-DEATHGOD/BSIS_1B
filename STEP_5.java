package STEP_BY_STEP_PROCEDURE;

import java.text.DecimalFormat;
                                              // === MAKE PANEL 1 TO GREET THE USER
import java.time.LocalDateTime;               // === WHICH THEN ADD CONDITION TO PROCEED ONLY IF THE USER PRESSED [YES]
                                              // === PANEL 2 WOULD THEN BE CALLED OUT TO ASK USER FOR ID WHICH WILL BE STORED IN ID
import javax.swing.JOptionPane;

public class STEP_5 { // CLASS START 
	
	public static void main(String[] args) { // MAIN METHOD START
		
	
				DecimalFormat df = new DecimalFormat("0.00"); 
				String gname = "\u001B[1m                G5's STATIONARY STORE\u001B[0m"; 
				LocalDateTime now = LocalDateTime.now(); 
				
	//PANEL 1
	int Intro = p ();
				
	if (Intro == JOptionPane.YES_OPTION) { // --- IF 1 START // IF is used to make it only run the code if YES button is pressed
	
	//PANEL 2	
	String ID = Id();
		
	} // --- IF 1 END // IF is used to make it only run the code if YES button is pressed [21]
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



