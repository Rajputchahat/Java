package set;
import java.util.Scanner;
import java.util.HashSet;
import model2.Student;
public class TestHashSet {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      HashSet<Student> set = new HashSet<Student>();
      for(int i=0;i<2;i++) {
    	  System.out.println("Enter st.Id");
    	  int a =sc.nextInt();
    	  System.out.println("Enter st.Name");
    	  String b = sc.next();
    	  System.out.println("Enter st.Course");
    	  String c = sc.next();
    	  
    	  Student st = new Student();
    	  st.setId(a);
    	  st.setName(b);
    	  st.setCourse(c);
    	  set.add(st);
      }
      
        System.out.println("*=========================================================*");
	    System.out.println("Id\tSt.name\tcourse");
	    System.out.println("*=========================================================*");
	    for(Student obj:set) {
	    	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getCourse());
	    }
      
	}

}
