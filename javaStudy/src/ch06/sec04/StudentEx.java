
package ch06.sec04;

public class StudentEx 
{
	
	public static void main (String[] args)
	{
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조 합니다.");
		
		
		// 두 변수가 다른 객체를 참조 한다는 것을 확인하기 위한 if
		if(s1 != s2)
		{
			System.out.println("두 변수가 같은 객체를 참조하고 있지 않습니다.");
		}
		
		else
		{
			System.out.println("두 변수가 같은 객체를 참조하고 있습니다.");
		}
	}

}


