
//1크기와 2크기의 값이 같은 이중 배열을 만들고%
//배열의 크기를 입력하고 1부터 배열의 크기^2 까지 출력 하시오


package ch05.exam;

import java.util.Scanner;

public class ArraryEX 

{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1크기와 2크기의 값이 같은 이중 배열의 크기를 입력하세요");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		int k = 0;
		
		
		int[][] arr = new int[num][num];
	
		for(int i = 0; i < num; i++ )
		{
			for(int j = 0; j < num; j++)
			{
			
				arr[i][j] = ++k;


		//출력
		for(int i = 0; i < num; i++ )
		{
			for(int j = 0; j < num; j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
