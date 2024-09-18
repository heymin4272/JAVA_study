package ch05.sec04;

public class GarbageObjectEX 
{
	public static void main(String[] args)
	{
		String hobby = "travel";
		hobby = null;
		
		 String car1 = "BMW";
		 String car2 = car1;
		 car1 = null;
		 
		 System.out.println(car1 + car2);
	}
}
