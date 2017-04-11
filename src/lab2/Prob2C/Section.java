package lab2.Prob2C;

import java.util.ArrayList;

public class Section 
{
public String sectionNum;
ArrayList<Student> studentlist;
Section(Student firststudent)
{

studentlist=new ArrayList<Student>();	
firststudent.addSection(this);
studentlist.add(firststudent);// to guarantee at least one student in a Section	
}
void addStudent(Student s)
{
s.addSection(this);
this.studentlist.add(s);
}
}
