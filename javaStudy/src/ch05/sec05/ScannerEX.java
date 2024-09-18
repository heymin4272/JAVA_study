package ch05.sec05;

import java.util.Scanner;

public class ScannerEX 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println( "x + y = " + result);
		System.out.println();
		
		while(true)
		{
			System.out.print("입력 : ");
			String input = scanner.nextLine();
			if(input.equals("q"))
			{
				break;
			}
			
			System.out.println("출력 : " + input);
			System.out.println();
			
		}
		System.out.println("종료");
		
		
	}
}
