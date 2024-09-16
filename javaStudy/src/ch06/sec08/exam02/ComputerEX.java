
package ch06.sec08.exam02;

public class ComputerEX 
{
	public static void main(String[] args)
	{
		// Computer 객체 선언
		Computer myCom = new Computer();
		
		//sum 메소드 호출 시 매개값 3개를 제공
		// 연산 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		//sum 메소드 호출 시 매개값 5개를 제공
		// 연산 결과를 리턴 받아 result2 변수에 대입
		//매개값 가지수의 증가
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : " + result2);
		
		// 배열을 선언하고 sum 메소드에 배열을 제공
		int[] values = { 1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		// sum 메소드 호출 시 배열을 매개변수 자리에 선언하여
		// 메소드에 배열을 제공
		int result4 = myCom.sum( new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
	}
}
