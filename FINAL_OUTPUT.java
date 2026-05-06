package CASHIER_SYSTEM;

import java.time.LocalDateTime; // up to date output

import java.text.DecimalFormat; // limit decimal format

import javax.swing.JOptionPane; // for the Panels

public class FINAL_OUTPUT { // --- CLASS START [9]

	public static void main(String[] args) { // --- MAIN METHOD START [11]
		
    // declare variables
		DecimalFormat df = new DecimalFormat("0.00");
		String gname = "\u001B[1m                G5's STATIONARY STORE\u001B[0m"; // bold group name - centered
		LocalDateTime now = LocalDateTime.now(); // for auto updated date and time
		
	//INTRO PANEL
	int Intro = p ();
	
	if (Intro == JOptionPane.YES_OPTION) { // --- IF 1 START // IF is used to make it only run the code if YES button is pressed
	
		String ID = Id();
		
		 while (!(ID.equals("040604") || //JOEL
				  ID.equals("000000") || //JOEMARC
				  ID.equals("103067") || //JONA
				  ID.equals("111111") || //ARJI
				  ID.equals("222222")	 //EDHEN	  
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
	     else if (ID.equals("111111")) {
		                  JOptionPane.showMessageDialog(null, "CASHIER: ARJI CORPUZ"); 
					      System.out.println("CASHIER    : ARJI CORPUZ");
					      }
	     else if (ID.equals("103067")) {
                          JOptionPane.showMessageDialog(null, "CASHIER: JONA V. BALINO"); 
		                  System.out.println("CASHIER    : JONA V. BALINO");
		      }
	     else if (ID.equals("000000")) {
                          JOptionPane.showMessageDialog(null, "CASHIER: JOEMARC BALISONG"); 
		                  System.out.println("CASHIER    : JOEMARC BALISONG");
		      }
	     else if (ID.equals("222222")) {
                          JOptionPane.showMessageDialog(null, "CASHIER: EDHEN MARQUEZ"); 
		                  System.out.println("CASHIER    : EDHEN MARQUEZ");
		      }
	     // add cashiers here
	 
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
		 

		while  (true) {
			
		while (!(    Order.equals("001") || 
					 Order.equals("002") || 
					 Order.equals("003") ||
					 Order.equals("004") ||
					 Order.equals("005") ||
					 Order.equals("006") ||
					 Order.equals("007") ||
					 Order.equals("008") ||
					 Order.equals("009") ||
					 Order.equals("010")
					 // ADD ITEMS TO SELL HERE
				)) {
			JOptionPane.showMessageDialog(null, "Item not Available!");
			Order = ItemName ();
			                               }
		
		int Quantity = Q(); // Q
		while (!(Quantity > 0 )) { 
			JOptionPane.showMessageDialog(null, "Invalid Q!");
			Quantity = Q();
		                         }
		// ==================================== Arithmetic
		
				// === variables
					double order1 = 0.00;
					
				// === order info PRICE
					switch (Order) {
					case "001":
						Order = "[001]PN "; order1 = 10.25;
						break;
					case "002":
						Order = "[002]PNC"; order1 = 15.50;
						break;
					case "003":
						Order = "[003]ERS"; order1 = 15.00;
						break;
					case "004":
						Order = "[004]RLR"; order1 = 15.25;
						break;
					case "005":
						Order = "[005]SPN"; order1 = 12.25;
						break;
					case "006":
						Order = "[006]PCC"; order1 = 45.50;
						break;
					case "007":
						Order = "[007]CY1"; order1 = 35.50;
						break;
					case "008":
						Order = "[008]CY2"; order1 = 70.00;
						break;
					case "009":
						Order = "[009]NTB"; order1 = 50.00;
						break;
					case "010":
						Order = "[010]SCS"; order1 = 60.25;
						break;
					}

			    // === Total price * quantity
					double T = order1 * Quantity;
					
					
					
				// ================================== OUTPUT 
					
					System.out.println("     "+Order+"        "+Quantity+"       "+order1+"     "+T+ "\n");
					
					SUBTOTAL += T;
					
				// ================================= LOOP to order again 
					int orderagain = JOptionPane.showConfirmDialog (null, "       ORDER ANOTHER?", "ADD ITEM", JOptionPane.YES_NO_OPTION);
					if (orderagain == JOptionPane.NO_OPTION) {
						
						System.out.println("--------------------------------------------------\n");
						
						break;
						
					} else {

					 Order = ItemName ();
					}
			
					}
		
		// === ARITHMETIC PART
		

					JOptionPane.showMessageDialog(null, "      DONE ADDING ITEMS!\n"+"\n"+"       PREPARE PAYMENT");
					
					double VAT = (SUBTOTAL * TAX);
					double TOTAL = VAT + SUBTOTAL;
					
					
					System.out.println("   SUBTOTAL  :   "+ df.format(SUBTOTAL));
					System.out.println("   VAT(12%)  :   "+ df.format(VAT));
					System.out.println("   TOTAL     :   "+ df.format(TOTAL)+"\n");
					
					/// === PAYMENT 
					
					double MONEY = Double.parseDouble(JOptionPane.showInputDialog(null, "AMOUNT TO PAY:"+ TOTAL+"\n"+ "ENTER CASH"));
					
					while (MONEY < TOTAL) {
						
						JOptionPane.showMessageDialog (null, "Not Enough Credentials");
						
						MONEY = Double.parseDouble(JOptionPane.showInputDialog(null, "AMOUNT TO PAY:"+ TOTAL+"\n"+ "ENTER CASH"));
						
					}
					
					
					double CHANGE = MONEY - TOTAL;
					System.out.println("   CASH      :   "+MONEY);
					System.out.println("   CHAMGE    :   "+df.format(CHANGE)+"\n");
					
					// ==================== THANK YOU PART
					
					System.out.println("   "
							+ "    THIS SERVES AS YOUR OFFICIAL RECEIPT.");
					System.out.println("             THANK YOU COME AGAIN!");
					
					
			
	} // === IF 1 END [21]	
	} // === MAIN METHOD END [11]
	
//===============================================================================================================================================================================
	
	
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
		
			
		 
	
	

} // === CLAS END [9]
