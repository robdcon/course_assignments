import java.util.Scanner;
/**
 * Test the class CashRegister by creating three seperate instances of cashRegister
 * and processing at least two items in each
 * 
 * @author Robert Connolly 
 * @version 25.02.17
 */
public class TestClass
{
    public static void main(String args[])
    {
        CashRegister reg1 = new CashRegister();//Create instance of CashRegister
        CashRegister reg2 = new CashRegister();//Create second instance of CashRegister
        CashRegister reg3 = new CashRegister();//Create third instance of CashRegister
        Scanner scan = new Scanner(System.in);//Create Scanner object
		
		//INITIAL TEST OF reg1
		for(int i=0; i<3; i++)
		{
			System.out.println("Please enter a price: ");
			Double input = scan.nextDouble();
			reg1.addItem(input);
		}
		//Ask user for 3 inputs and output the calculations
		System.out.println("The total price is " + reg1.getTotal() + ", the item count is " + reg1.getCount());
		//Use clear method to reset values
		reg1.clear();
		
		//INITIAL TEST OF reg2
		for(int i=0; i<3; i++)
		{
			System.out.println("Please enter a price: ");
			Double input = scan.nextDouble();
			reg1.addItem(input);
		}
		//Ask user for 3 inputs and output the calculations
		System.out.println("The total price is " + reg1.getTotal() + ", the item count is " + reg1.getCount());
		//Use clear method to reset values
		reg1.clear();
		
		//INITIAL TEST OF reg3
		for(int i=0; i<3; i++)
		{
			System.out.println("Please enter a price: ");
			Double input = scan.nextDouble();
			reg1.addItem(input);
		}
		//Ask user for 3 inputs and output the calculations
		System.out.println("The total price is " + reg1.getTotal() + ", the item count is " + reg1.getCount());
		//Use clear method to reset values
		reg1.clear();


		//SECOND TEST

        //Add 3 items using reg1 object instance
        reg1.addItem(2.50);
        reg1.addItem(3.25);
        reg1.addItem(3.50);
        //Print the results of the methods
        //Print the result of a test against the expected results of the methods
        System.out.println(reg1.getCount());
        System.out.println("Result: " + ((reg1.getCount() == 3)?"PASS":"FAIL"));
        System.out.printf("%.2f\n" , reg1.getTotal());
        System.out.println("Result: " + ((reg1.getTotal() == 9.25)?"PASS":"FAIL"));
		//Clear variables
        reg1.clear();
        //Add 3 items using reg2 object instance
        reg2.addItem(3.50);
        reg2.addItem(3.25);
        reg2.addItem(4.75);
        //Print the results of the methods
        //Print the result of a test against the expected results of the methods
        System.out.println(reg1.getCount());
        System.out.println("Result: " + ((reg1.getCount() == 3)?"PASS":"FAIL"));
        System.out.printf("%.2f\n" , reg1.getTotal());
        System.out.println("Result: " + ((reg1.getTotal() == 11.50)?"PASS":"FAIL"));
		//Clear variables
        reg2.clear();
        //Add 3 items using reg3 object instance
        reg3.addItem(1.20);
        reg3.addItem(2.55);
        reg3.addItem(11.80);
        //Print the results of the methods
        //Print the result of a test against the expected results of the methods
        System.out.println(reg1.getCount());
        System.out.println("Result: " + ((reg1.getCount() == 3)?"PASS":"FAIL"));
        System.out.printf("%.2f\n" , reg1.getTotal());
        System.out.println("Result: " + ((reg1.getTotal() == 15.55)?"PASS":"FAIL"));
		//Clear variables
        reg3.clear();
    }
}
