//Driver program to implement Date program
public class DateTest {

	public static void main(String[] args)
	{
		//creating objects and initialising the instance member 
		Date newDate=new Date(7,7,2018);
		Date anotherNewDate=new Date(1,1,1990);
		
		int ar[]=newDate.differenceFirstway(anotherNewDate);
		
		System.out.println("Date 1:-"+newDate);
		System.out.println("Date 2:-"+anotherNewDate);
		System.out.println("Total Days difference is "+ar[0]+"\nTotal Months difference is "+ar[1]+"\nTotal Years difference is "+ar[2]);
		
	}

}
