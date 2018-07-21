//Calculating Discount
class Discount
{
	public static void main(String args[])
	{
		double newItem = 10000;			//setting the price of the item
		double discount = newItem*35/100;	//calculating the discount amount
		double newItemPrice = newItem-discount;	//calculating the new discounted price
		
		System.out.print("Discounted Price = Rs. "+newItemPrice);	//displaying the discounted price
	}
}
