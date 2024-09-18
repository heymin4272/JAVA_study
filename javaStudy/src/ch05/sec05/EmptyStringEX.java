package ch05.sec05;

public class EmptyStringEX 
{
	public static void main(String[] args)
	{
		String hobby = "";
		if(hobby.equals("")) 
		{
			System.out.println("빈 문자열도 객체가 될 수 있다.");
		}
	}
}
