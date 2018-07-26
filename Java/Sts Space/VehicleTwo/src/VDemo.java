//Driver program for calling the function
public class VDemo
{
	public static void main(String args[])
	{
		
		Vehicle vehAr[] = new Vehicle[3];
		
		//Creating the objects
		TwoWheeler twoWheeler = new TwoWheeler();
		ThreeWheeler threeWheeler = new ThreeWheeler();
		FourWheeler fourWheeler = new FourWheeler();
		
		//storing the objects in the array
		vehAr[0] = twoWheeler;
		vehAr[1] = threeWheeler;
		vehAr[2] = fourWheeler;
		
		for(int i=0;i<3;i++)
		{
			if(vehAr[i]==threeWheeler)
				vehAr[i].start();
		}
	}
}
