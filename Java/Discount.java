//Calculating Discount
class Discount
{
	public static void main(String args[])
	{
		double newItem = 10000;
		double discount = newItem*35/100;
		double newItemPrice = newItem-discount;
		
		System.out.print("Discounted Price = Rs. "+newItemPrice);
	}
}