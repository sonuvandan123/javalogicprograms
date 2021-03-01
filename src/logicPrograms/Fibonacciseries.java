package logicPrograms;

public class Fibonacciseries
{
	public static void main(String[] args) {
		int prev=0;
		int currentValue=1;
		
		int nextValue;
		System.out.println(prev);
		System.out.println(currentValue);
		System.out.println();
		for(int i=0;i<10;i++)
		{
			nextValue=prev+currentValue;
			System.out.print(" "+nextValue);
			
			prev=currentValue;
			currentValue=nextValue;
			
		}
		
	}
}
