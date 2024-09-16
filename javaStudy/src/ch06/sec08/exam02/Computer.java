

// 가변길이 매개변수
package ch06.sec08.exam02;

public class Computer 
{
	int sum(int ... values) // 가변길이 매개변수 선언 형식
	{
		// sum 변수 선언
		int sum = 0;
		
		// values는 배열 타입의 변수처럼 사용
		for(int i = 0; i < values.length; i++)
		{
			sum += values[i];
		}
		
		// 연산 결과를 리턴
		return sum;
		
	}
}
