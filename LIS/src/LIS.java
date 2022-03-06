import java.util.Scanner;
public class LIS {
	public int[] lis(int[] x) {
		int n= x.length - 1;
		int[] a=new int[n+1];
		int[] b=new int[n+1];
		int c=0;
		for (int i=1; i<n+1; i++)
		{
			int j=0;
			for (int L=c; L>=1; L--)
			{
				if(x[a[L]]<x[i])
				{
					j=L;
					break;
				}
			}
			b[i]=a[j];
			if (j == c || x[i]<x[a[j+1]])
			{
				a[j+1]=i;
				c=Math.max(c,j+1);
			}
		}
		int[] result=new int[c];
		int L=a[c];
		for (int i=c-1; i>=0; i--)
		{
			result[i]=x[L];
			L=b[L];
		}
		return result;
	}
	
    	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter number of elements");
    	int n=scan.nextInt();
    	int[] arr=new int[n+1];
    	System.out.println("Enter "+ n + " elements");
    	for (int i=1; i<=n; i++)
    		arr[i]=scan.nextInt();
    	LIS obj=new LIS();
    	int[] result=obj.lis(arr);
    	System.out.println("\nLongest Increasing Subsequence: ");
    	for (int i=0; i < result.length; i++)
    		System.out.println(result[i] + " ");
    		System.out.println();
		}
}
