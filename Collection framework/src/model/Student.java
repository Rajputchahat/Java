package model;

public class Student {
		private int roll;
		private String name,course;
		//setter
		public void setRoll(int roll)
		{
			this.roll = roll;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public void setCourse(String course)
		{
			this.course = course;
		}
		//getter
		public int getRoll()
		{
			return roll;
		}
		public String getName()
		{
			return name;
		}
		public String getcourse()
		{
			return course;
		}
	}
