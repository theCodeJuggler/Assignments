//WProgram10
//Implementing the bubble sort algorithm
class Bsort
{
	public static void main(String args[])
	{
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; //initializing sample array
		int l=ar.length, temp;
		
		//bubble sort algorithm
		for(int i=1;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(ar[i]<ar[j])
				{	//swapping the values
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		//displaying the sorted resultanrt array
		System.out.println("Sorted Array is :");
		for(int i=0;i<l;i++)
			System.out.print(ar[i]+" ");
	}
}
