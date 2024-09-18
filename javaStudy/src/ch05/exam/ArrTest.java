package ch05.exam;



import java.util.Scanner;

public class ArrTest 


{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 1크기를 입력하세요");
		String input = scan.nextLine();
		int num1 = Integer.parseInt(input);
		
		System.out.println("배열의 2크기를 입력하세요");
		input = scan.nextLine();
		int num2 = Integer.parseInt(input);
		
		
		
		int[][] arr = new int[num1][num2];
	
		for(int i = 0; i < num1; i++ )
		{
			System.out.println("숫자를 " + num2 + "개 입력하세요");
			for(int j = 0; j < num2; j++)
			{
				String val = scan.nextLine();
				int value = Integer.parseInt(val);
				arr[i][j] = value;
			}
		}
		
		//출력
		for(int i = 0; i < num1; i++ )
		{
			for(int j = 0; j < num2; j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}