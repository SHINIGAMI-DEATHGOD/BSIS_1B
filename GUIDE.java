package STEP_BY_STEP_PROCEDURE;

import javax.swing.JOptionPane;

public class GUIDE {

	public static void main(String[] args) {
		
		// BSIS_1B
		// COM PROG II
		// MEMBERS FOR THIS GROUP ACTIVITY
		
		
		// JOEL GIAN KARL DELA TORRE
		// JONA BALINO
		// EDHEN MARQUEZ
		// ARJI CORPUZ
		// JOEMARC BALISONG
		
		
				
// TUTORIAL MADE BY [SHINIGAMI] IGN KO LNG PO 
	// TUTURIAL MADE BY JOEL --- NA BORING LANG PO
		
		
// INORDER TO HAVE A PROPER WORKING CASHIERING SYSTEM... WE MUST FIRST IDENTIFY WHAT TO USE INORDER TO HAVE THE PANEL
// SINCE JAVA ALREADY HAS A PRE BUILT SYSTEM THAT HAS PANEL... WHICH IS "JOptionPane".... HENCE WE WILL USE THAT AND IMPORT JOPTION BECAUSE WE STILL DON'T KNOW TO MAKE ONE.

		// JOPTIONPANE HAS 4 PRE MADE PANELS WHICH IS:
		// JOptionPane.showMessageDialog --- this shows a message with only an [ok] button
		// JOptionPane.showInputDialog   --- this show an input box where u can type numbers, letters, or special characters with an [ok] and [cancel] button.
		// JOptionpane.showConfirmDialog --- this shows a message with a [YES], [NO], and [CANCEL] option which you can edit to only have [YES] or [NO] option.
		// JOptionPane.showOptionDialog  --- which is the most customizable one but we didn't use this one since were only making simple cashier system

// ONCE WE ARE DONE WITH IDENTIFYING WHAT TO USE THEN WE CAN ACTUALLY PROCEED TO MAKING THE CALCULATOR 

// PANEL 1
		/*SINCE WE NEED A WELCOME PANEL AND ASK THE USER AT THE SAME TIME WHETHER TO PROCEED OR NOT WITH THE CASHIER THEN WE WOULD NEED TO USE CONFIRM DIALOG*/
		JOptionPane.showConfirmDialog(null, "any message"); // after which u can edit the "any message"
// PANEL 2
		/*AFTER ASKING WHETHER TO PROCEED OR NOT, THE NEXT PANEL SHOULD ASK THE USER FOR CASHIER ID AS A FORM OF SECURITY*/
		JOptionPane.showInputDialog(null, "any message"); // btw were using null that way the panel is always centered rather than it being anchored
// PANEL 3 
		// WHEN THE CASHIER ID IS CONFIRMED, WE CAN ATLEAST SHOW A WELCOME PANEL FOR THE USER
		JOptionPane.showMessageDialog(null, "any message");
// PANEL 4
		// PANEL 4 will be is where the system asks for the customer name where it'll be optional because it will still proceed whether they enter their name or not
        JOptionPane.showInputDialog(null, "any message");
        // AFTER WHICH THEY ENTER A NAME... the system will print a simple welcome and information of date of purchase,cashier's name, as well as customer's name.
// PANEL 5
        // PANEL 5 WILL BE IS WHERE IT'LL DISPLAY THE ITEM CODES AND INPUT PANEL
        JOptionPane.showInputDialog(null, "any message");
// PANEL 6
        // PANEL 6 IS ALSO AN INPUT DIALOG WHERE IT ASKS THE USER TO INPUT THE QUANTITY OR HOW MUCH ITEM TO ORDER
        JOptionPane.showInputDialog(null, "any messagw"); // IT WOULD THEN PRINT THE ITEM INFO IF [OK] WAS PRESSED
// PANEL 7
        // PANEL 7 WOULD THEN ASK THE USER WHETHER TO ORDER AGAIN OR NOT BY USING CONFIRM DIALOG
        JOptionPane.showConfirmDialog(null, "any message"); 
        // IF USER PRESSED YES IT WOULD LOOP BACK TO PANEL 5
        // IF PRESSED NO, IT WILL PRINT A SEPARATING LINE FOR THE ITEMS BOUGHT AND PROCEED TO PANEL 8
// PANEL 8 
        // IT WILL ASK THE USER TO PREPARE PAYMENT
        JOptionPane.showMessageDialog(null, "any message");
// PANEL 9
        // panel 9 will be where it will asks u to enter credentials to subtract to ur item's total price with tax
        JOptionPane.showInputDialog(null, "any message");
        
// THE LAST PART WILL BE IS WHERE UR CASH AND CHANGE IS DISPLAYED VIA PRINT
        
        
        
        
        
// ============= [NOTE] ==============
   /* MAG KAKA IBA PO TAU NG WAY PANO GUMAWA NG SYSTEM KAYA POSSIBLE THEN NA IBA WAY NG OTHER GROUPS
    * AND FOR ME LANG PO IS GANTO PO AKO GUMAWA TY! 
   */     
   
 

		
	}

}
