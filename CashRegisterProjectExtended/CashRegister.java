
/**
 * Add an item's price.
 * Clear register for next sale.
 * Get the current number of items in a sale.
 * Get the current total price of the sale.
 * 
 * 
 * 
 * @author Robert Connolly
 * @23.02.17
 */
public class CashRegister
{
    private static int itemCount;
    private static int totalPrice;
    public void addItem(double price) 
    {
		price = price*100;
		totalPrice += Math.round(price);
        itemCount++;
    }
    public void clear()
    {
       totalPrice = 0;
       itemCount = 0;
    }
    public int getCount()
    {
        return itemCount;
    }
    public double getTotal()
    {
        return  (double)totalPrice/100;
    }
    public CashRegister() 
    {
        totalPrice = 0;
        itemCount = 0;
    }
}
