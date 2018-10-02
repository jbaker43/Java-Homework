/**
 * Calculate total cost by adding the tax rate to the price to yeild net price and salestax
 * Jacob Baker
 * 9/21/18
 */ 

public class SalesTax

{
  double taxRate=.05;
   double salesTax;
   double price;
   double net_price;
   public SalesTax(double taxRate, double totalCost)
   {
       taxRate =totalCost;
   }
   public void calculate_tax(double p)
   {
       price=p;
       double t;
       salesTax=(price * taxRate)/100;
   }
   public void Totalcost()
   {
       //adding the tax and original price
       net_price=taxRate+price;
      
   }
   public double get_tax()
   {
       return salesTax;
   }
   public double get_Totalcost()
   {
       return net_price;
   }
}
