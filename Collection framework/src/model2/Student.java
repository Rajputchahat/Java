 package model2;

public class Student
{
    //Instance variable
	public int id;
	public String name, course;
	
	//setter
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	//Getter
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCourse()
	{
		return course;
	}
}

