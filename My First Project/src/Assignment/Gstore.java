package Assignment;
import java.util.*;
public class Gstore {

	public static void main(String[] args) 
	{
     ArrayList<Details> al = new ArrayList<Details>();
     int a;
     System.out.println("\t\t\t\t\t Welcome To Ramu General Store");	
     System.out.println("\t\t\t\t\t*-------*-------*------*-------*");
     do
     {
     System.out.println("Press 1 : for add Product");
     System.out.println("Press 2 : for sale Product");
     System.out.println("Press 3 : for find Product");
     System.out.println("Press 4 : for list of Product");
     System.out.println("Press 0 : for exist!");
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();
     if(a==1)
     {  
    	 System.out.print("Enter Product Id : ");
         int b = sc.nextInt();
         System.out.print("Enter Product Name : ");
         String c = sc.next();
         System.out.print("Enter Product Price : ");
         int d = sc.nextInt();
         System.out.print("Enter Product Qty : ");
         int e = sc.nextInt();
         System.out.println("Thank You");
         Details dl = new Details();
         dl.setId(b);
         dl.setName(c);
         dl.setPrice(d);
         dl.setQty(e);
         //add to container
         al.add(dl);  
     }
     else if(a==4)
     {
    	 System.out.println("ID\tName\t\tPrice\t\tQty");
    	 System.out.println("===============================================");
    	 for(int i=0;i<al.size();i++)
    	 {
    		 Details obj = al.get(i);
    		System.out.println(obj.getId()+"\t"+obj.getName()+"\t\t"+obj.getPrice()+"\t\t"+obj.getQty()); 
    	 }
    	 System.out.println("===============================================");
     }
     }
     while(a!=0);
	}
}
