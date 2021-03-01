package logicPrograms;

public class PrimeNumberforrange
{
	public static void main(String[] args) 
	{
		
		System.out.println("Prime numbers are...");
		for(int num=1;num<=10;num++)
		{
		     int flag=1;	
		     for(int j=2;j<num;j++)
		     {
		         if(num%j==0)
			     {
				     flag=0;
		         }
		     }
		    if(flag==1)
		    {
				System.out.println(" "+num);
		    }
		}
}
}
