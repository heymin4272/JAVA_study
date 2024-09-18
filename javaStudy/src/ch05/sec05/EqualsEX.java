





package ch05.sec05;

public class EqualsEX 
{
	public static void main(String[] args)
	{
		String str1 = "HEYMIN";
		String str2 = "HEYMIN";
		
		String str3 = new String("HEYMIN");
		String str4 = new String("HEYMIN");
		
		if( str1 == str2 )
		{
			System.out.println("str1와 str2가 같은 객체를 참조");
		}
		else
		{
			System.out.println("str1와 str2가 다른 객체를 참조");
		}

		if( str3 == str4 )
		{
			System.out.println("str3와 str4가 같은 객체를 참조");
		}
		else
		{
			System.out.println("str3와 str4가 다른 객체를 참조");
		}
		
		if( str3.equals(str4))
		{
			System.out.println("str3과 str4의 문자열이 같음.");
		}
		
		
	}
}
