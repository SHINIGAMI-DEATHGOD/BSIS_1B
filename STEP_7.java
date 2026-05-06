package STEP_BY_STEP_PROCEDURE;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class STEP_7 {
public static void main(String[] args) { // MAIN METHOD START
		
		
		DecimalFormat df = new DecimalFormat("0.00"); 
		String gname = "\u001B[1m                G5's STATIONARY STORE\u001B[0m"; 
		LocalDateTime now = LocalDateTime.now(); 
		
//PANEL 1
int Intro = p ();
		
if (Intro == JOptionPane.YES_OPTION) { // --- IF 1 START // IF is used to make it only run the code if YES button is pressed

//PANEL 2	
String ID = Id();
while (!(ID.equals("040604") || 
		  ID.equals("040606") ||
		  ID.equals("040604")
		  // add cashier ID here 
		 )) { // WHILE 1 START
	 JOptionPane.showMessageDialog(null,"       "+"Invalid ID. Pls Try Again!");
ID = Id();} // WHILE 1 END

System.out.println(gname + "\n" + 
			" DON MARIANNO MARCOS MEMORRIAL STATE UNIVERSITY" +
		    "\n" + 
			"               +639071165180" + "\n");
if      (ID.equals("040604")) {
			      JOptionPane.showMessageDialog(null, "CASHIER: JOEL GIAN KARL DELA TORRE"); 
			      System.out.println("CASHIER    : JOEL GIAN KARL DELA TORRE");
			      } 
else if (ID.equals("040606")) {
                JOptionPane.showMessageDialog(null, "CASHIER: JONA BALINO"); 
			      System.out.println("CASHIER    : JONA BALINO");
			      }

// ===================================  customer, date INFO

String cname = JOptionPane.showInputDialog(null, "CUSTOMER NAME: " );
	
System.out.println("Customer   : "+cname);
System.out.println("Date       : "+ now);
	

// =================================== item info

System.out.println("==================================================\n");
System.out.println("      ITEM      |    Q    |    P    |    T\n");
System.out.println("==================================================\n");

// =================================== JOPTION PANEL DESCRIPTION 

String Order = ItemName (); //Item

// =================================== important variables

double SUBTOTAL = 0;
double TAX = 0.12;

// add cashiers here

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



}
