package lab2.Prob2A;

public class Student
{
	private String name;
	GradeReport gradeSheet;
	Student()
	{
		gradeSheet=new GradeReport(this);
	}
	
}
