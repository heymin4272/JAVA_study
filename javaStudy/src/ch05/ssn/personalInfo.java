package ch05.ssn;

public class personalInfo 
{
	String PersonalID;
	String gender = getGender();
	int age = getAge();
	String birthYear = PersonalID.substring(0,2);
	String birthMonth = PersonalID.substring(2,4);
	String birthDay = PersonalID.substring(4,6);
	
	
	
	 public personalInfo(String PersonalID)
	{
		this.PersonalID = PersonalID;
		this.gender = gender;
		this.age = age;
		this.birthYear =birthYear;
		this.birthMonth = birthMonth;
		this.birthMonth = birthDay;
		
	}
	 
	
	// Method
	String getGender ()
	{
		char genderStr = PersonalID.charAt(6);
		
		switch (genderStr)
		{
			case '1':
			case '3':
				gender = "male";
				break;
				
			case '2': 
			case '4': 
				gender = "female";
				break;
		}
		
		return gender;	
	}
	
	int getAge ()
	{
		String birthYearStr = PersonalID.substring(0,3);
		int birthYear = Integer.parseInt(birthYearStr);
		
		if(25 <birthYear && birthYear < 100)
		{
			 birthYear = birthYear + 1900;
		}
		
		else if(0 <= birthYear && birthYear <= 24) // 2024년 기
		{
			birthYear = birthYear + 2000;
		}
		
		else
		{
			System.out.println("입력 오류 ");
		}
		
		int age = 2024 - birthYear;
		
		return age;
	}
}
