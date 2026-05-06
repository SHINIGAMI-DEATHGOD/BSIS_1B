package TRIAL_N_ERROR;

import java.time.LocalDateTime;

// ===[Rember to always import first]=== is to [import javax.swing.JOptionPane;]

import javax.swing.JOptionPane;


// ===[Note!!!]=== 
// --- showMessageDialog();
// --- showConfirmDialog(); --- "You can also add JOptionPane.YES_NO_OPTION" to remove cancel
// --- showInputDialog();
// --- showOptionDialog();
// === [Attach to] JOptionPane.(attach showmsg here)

//======================================================================================
import javax.swing.*;


public class TEST_1 {

	public static void main(String[] args) {
		
		String gname = "\u001B[1m                 G5's STATIONARY STORE\u001B[0m";
		LocalDateTime now = LocalDateTime.now();
		
;
		
	int p =	JOptionPane.showConfirmDialog(null,"---------------WELCOME TO---------------\n"
+"         G5's STATIONARY STORE"+"\n"+"--------------------------------------------------"+"\n"
+"                    Proceed?","Welcome", JOptionPane.YES_NO_OPTION);
	
	if (p == JOptionPane.YES_OPTION) { 
		String id = JOptionPane.showInputDialog(null,"CASHIER ID: ");

		
		
// ===================================[JOEL]
		if (id.equalsIgnoreCase("040604")) { System.out.println(gname + "\n" + 
	" DON MARIANNO MARCOS MEMORRIAL STATE UNIVERSITY" + "\n" + "               +639071165180" + "\n");
	      JOptionPane.showMessageDialog(null, "CASHIER: JOEL GIAN KARL DELA TORRE"); 
	      System.out.println("CASHIER    : JOEL GIAN KARL DELA TORRE");
			
		} else {JOptionPane.showMessageDialog(null,"               "+"Invalid ID!!!");} // Add cashiers here
	
	
// =================================== cashier, customer, date	
	
	String cname = JOptionPane.showInputDialog(null, "CUSTOMER NAME: " );
	

	System.out.println("Customer   : "+cname);
	System.out.println("Date       : "+ now);
	// === item info
	System.out.println("==================================================\n");
	System.out.println("      ITEM      |    Q    |    P    |    T");
	
	
    String order = JOptionPane.showInputDialog(null,"CODE\n"+"[001] PEN\n"+"[002] PENCIL\n"+"[003] ERASER\n"+"[004] RULER\n"+"[005] SHARPENER\n"+"[006] PENCIL CASE\n"
	                                                           +"[007] CRAYON1(8)\n"+"[008] CRAYON2 (12)\n"+"[009] NOTEBOOK\n"+"[010] SCISSORS\n");
	int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTITY\n"+"ENTER ITEM COUNT:"));
	
// === variables
	double order1 = 0.00;
	
// === order info
	switch (order) {
	case "001":
		order = "[001]PN"; order1 = 10.25;
	case "002":
		order = "[002PNC"; order1 = 15.50;
	case "003":
		order = "[003]ERS"; order1 = 15.00;
	case "004":
		order = "[004]RLR"; order1 = 15.25;
	case "005":
		order = "[005]SPN"; order1 = 12.25;
	case "006":
		order = "[006]PCC"; order1 = 45.50;
	case "007":
		order = "[007]CRY1"; order1 = 35.50;
	case "008":
		order = "[008]CRY2"; order1 = 70.00;
	case "009":
		order = "[009]NTB"; order1 = 50.00;
	case "010":
		order = "[010]SCS"; order1 = 60.25;
	}

// === Total price * quantity
	double T = order1 * quantity;
	
// below ITEM - Q - P - T
	
System.out.println("     "+order+"        "+quantity+"       "+order1+"     "+T);

		
	} 

	}
	}
