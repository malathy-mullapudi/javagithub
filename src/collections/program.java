package collections;

import java.util.ArrayList;

public class program {
	public static void main(String[] args) {
		System.out.println("Started");
		
		var lkgGrade = CreateGrade("LKG");
		
		var koushik = new Student();
		koushik.StudentName = "Koushik";
		
		var koushikMathsResult = new Result();
		koushikMathsResult.SubjectName = "Maths";
		koushikMathsResult.Marks = 10;
		
		koushik.Results.add(koushikMathsResult);
		
		lkgGrade.Students.add(koushik);
		lkgGrade.Subjects.add(new Subject());
		
	}
	
	public static Grade CreateGrade(String gradeName)
	{
		var grade = new Grade();
		grade.Name = gradeName;
		return grade;
	}
}
