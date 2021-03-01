package logicPrograms;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=12; 
		int flag=0;
		
		for(int i=2;i<97;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
				//System.out.println("Number is not prime");
			}
			/*
			 * else { System.out.println("Number is prime"); }
			 */
		}
		if(flag==1)
		{
			System.out.println("Number is not prime");
		}	
		else
		{
			System.out.println("Number is prime");
		}
		

	}

}
