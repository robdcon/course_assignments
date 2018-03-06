
/**
 * Program objective : Create instances of Cycle and keep track of each of their docked/undocked status
 * 
 * @author Robert Connolly 
 * @version 10.03.17
 */
public class Cycle
{  
    private int ID = 0;    
    private int dockingStationID;
    public static int lastAssignedNumber = 100;
    
    //Method:Get the ID of an instance of class Cycle
    public int getID()
    {
        return ID;
    }
    //Check if the Cycle instance is parked (i.e. has a reference to a docking station, dockingSattionID),
    //or if it is in use (i.e. has 0 as its dockingStationID)
    //return appropriate msg
    public String getDockingStationNo()
    {
        String msg = "";
        if(dockingStationID == 0)
        {
            msg = " is in use";
        }
        else if(dockingStationID > 0)
        {
            msg = " is docked at " + dockingStationID;
        }
        return msg;
    }
    //Check the Cycle is not in use by accessing its dockingStationID
    //If not in use, mark the Cycle as in use by changeing its dockingStationID to 0
    public boolean pickup()
    {
        if(!(dockingStationID == 0))
        {
            dockingStationID = 0;
            return true;
        }
        else 
        {
            return false;
        }
    }
    //Check the Cycle is in use by accessing its dockingStationID
    //If in use, mark the Cycle as docked by changing its dockingStationID to dockSID
    public boolean park(int dockSID)
    {
        if(dockingStationID == 0)
        {
            dockingStationID = dockSID;
            return true;
        }
        else 
        {
            return false;
        }
    }
    public Cycle()
    {
        
        this.ID = ++lastAssignedNumber;
        this.dockingStationID = 0;
    }
    public static int getNumberOfCycles()
    {
        return lastAssignedNumber - 100;
    }
    public static int getRandomNumber(int min,int max)
    {
        int random;
        do 
           {
               random = (int)((Math.random()*max));                           
        }
        while(random <= min || random >= max );
        return random;
    }
}
   
    

