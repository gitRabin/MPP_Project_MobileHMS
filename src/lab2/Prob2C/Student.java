package lab2.Prob2C;

import java.util.ArrayList;

import org.w3c.dom.ls.LSInput;

public class Student
{
public String name;
ArrayList<Section> listOfSection;
Student()
{
	listOfSection=new ArrayList<Section>();
}
void addSection(Section s)
{

	s.studentlist.add(this);
	listOfSection.add(s);
}
}
