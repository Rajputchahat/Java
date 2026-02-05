package datastructure;
import java.util.ArrayList;
import model.Student;
public class MyGeneric {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("Ram");
		s1.setCourse("Java");
		Student s2 = new Student();
		s2.setRoll(102);
		s2.setName("Ramesh");
		s2.setCourse("python");
		//add to container
		al.add(s1);
		al.add(s2);
		System.out.println("Roll\tName\tCourse");
		for(int i = 0;i<al.size();i++)
		{
			Student obj = al.get(i);
			System.out.println(obj.getRoll()+"\t"+obj.getName()+"\t"+obj.getcourse());
		} 
	}
}
