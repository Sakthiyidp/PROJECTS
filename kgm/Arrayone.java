class Arrayone
	{
		public static void main(String args[])
	{
		int a[],sum=0;
		a=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		
	}
		System.out.println(sum);
	}
	}