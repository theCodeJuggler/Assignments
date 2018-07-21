//WProgram10
class Bsort
{
	public static void main(String args[])
	{
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int l=ar.length, temp;
		
		for(int i=1;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is :");
		for(int i=0;i<l;i++)
			System.out.print(ar[i]+" ");
	}
}