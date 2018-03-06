import java.util.Scanner;
/**
 * Program Objective: Test the Cycle class
 * 
 * @author Robert Connolly
 * @version 16.03.17
 */
public class CycleTest
{
    public static void main(String args[])
    {
        
        int dockInput;
        
        //Create instance of cycle1
        Cycle cycle1 = new Cycle();
        
       //Create instance of cycle2
        Cycle cycle2 = new Cycle();
        
        //Create instance of cycle3
        Cycle cycle3 = new Cycle();
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter docking station number for Cycle 1: ");
        dockInput = scan.nextInt();
        cycle1.park(dockInput);
        
        System.out.println("Enter docking station number for Cycle 2: ");
        dockInput = scan.nextInt();
        cycle2.park(dockInput);
        
        System.out.println("Enter docking station number for Cycle 3: ");
        dockInput = scan.nextInt();
        cycle3.park(dockInput);
        
        
        System.out.println("\nCycle with ID:" + cycle1.getID() + cycle1.getDockingStationNo());
               
        System.out.println("\nCycle with ID:" + cycle2.getID() + cycle2.getDockingStationNo());                
        
        System.out.println("\nCycle with ID:" + cycle3.getID() + cycle3.getDockingStationNo()); 
        
        System.out.println("\nNumber of cycles currently in system: " + Cycle.getNumberOfCycles());
        
        cycle1.pickup();
        cycle2.pickup();
        cycle3.pickup();
        
        System.out.println("\nOUTPUT AFTER pickup() METHOD CALLED: ");
        
        System.out.println("\nCycle with ID:" + cycle1.getID() + cycle1.getDockingStationNo());
               
        System.out.println("\nCycle with ID:" + cycle2.getID() + cycle2.getDockingStationNo());                
        
        System.out.println("\nCycle with ID:" + cycle3.getID() + cycle3.getDockingStationNo()); 
        
        System.out.println("\nNumber of cycles currently in system: " + Cycle.getNumberOfCycles());
        
        System.out.println("\nOUTPUT USING RANDOM NUMBER METHOD AND PARK METHOD: ");
        
        dockInput = Cycle.getRandomNumber(0,10);
        cycle1.park(dockInput);
        
        dockInput = Cycle.getRandomNumber(0,10);
        cycle2.park(dockInput);
        
        dockInput = Cycle.getRandomNumber(0,10);
        cycle3.park(dockInput);
        
        System.out.println("\nCycle with ID:" + cycle1.getID() + cycle1.getDockingStationNo());
               
        System.out.println("\nCycle with ID:" + cycle2.getID() + cycle2.getDockingStationNo());                
        
        System.out.println("\nCycle with ID:" + cycle3.getID() + cycle3.getDockingStationNo()); 
        
        
    }
}        
        

