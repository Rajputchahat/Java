package Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import model2.AddProduct;
public class Store {

	public static void main(String[] args) 
	{
	int i;
	ArrayList<AddProduct> pro = new ArrayList<AddProduct>();
	Scanner sc = new Scanner(System.in);
	System.out.println("===========================================================================");
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<WELCOME TO GENERAL STORE>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("===========================================================================");
	do 
	{
		System.out.println("Press 1 : For Add Product");
		System.out.println("Press 2 : For Search Product");
		System.out.println("Press 3 : For Show All Product");
		System.out.println("Press 4 : For Sale Product");
		System.out.println("Press 0 : For Exit");
		System.out.println("Enter Your Choice...");
	    i = sc.nextInt();
	    if(i==1) 
	    {
	    	System.out.print("Enter Product ID: ");
	        int a = sc.nextInt();
	    	System.out.print("Enter Product Name: ");
	        String b = sc.next();
	    	System.out.print("Enter Product Price: ");
	        int c = sc.nextInt();
	        System.out.print("Enter Product Quantity: ");
	        int d = sc.nextInt();
	        AddProduct pd = new AddProduct();
	        pd.setId(a);
	        pd.setName(b);
	        pd.setPrice(c);
	        pd.setQty(d);
	        pro.add(pd);
	        System.out.println("******************Product Add Successfully****************************");
	    }
	    else if(i==2) 
	    {
	    	System.out.println("Enter Product ID: ");
	    	int x = sc.nextInt();
	    	for(AddProduct obj : pro) {
	    	int y = obj.getId();
	    	if(x==y) 
	    	{ 
	        System.out.println("=====================================================================");
		    System.out.println("ID\tNAME\tPRICE\tQuantity");
		    System.out.println("=====================================================================");
	    	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getQty());
	    	System.out.println("*******************Thank you and Hava a nice day!********************");
	    	}
	    	}
	    }
	    else if(i==3)
	    {
	    	System.out.println("Products Available on Store are:->");
	    	System.out.println("=====================================================================");
	    	System.out.println("ID\tNAME\tPRICE\tQuantity");
	    	System.out.println("=====================================================================");
	    	for(AddProduct obj : pro) 
	    	{
		    System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getQty());
	    	}
	    	System.out.println("*******************Thank you and Hava a nice day!********************");
	    }
	    else if(i==4)
	    {
	    	System.out.print("Enter Product ID: ");
	    	int r = sc.nextInt();
	    	System.out.print("Enter Product Quantity: ");
	        int s = sc.nextInt();
	     	System.out.println("#############################Invoice#################################");
	    	for(AddProduct obj: pro) {
	    	int t = obj.getId();
	    	int j=1;
	    	if(r==t) {
	    	int u = obj.getPrice();
	    	double total=s*u;
	    	System.out.println("S.NO\tNAME\tPRICE\tQTY\tTOTAL");
	    	System.out.println(j+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+s+"\t"+total);
	     	System.out.println("Net Payable Amount:->\t\t"+total+"/-");
	     	obj.setQty(obj.getQty()-s);
	     	
	    	}
	    	}
	    	System.out.println("########################Thanks & Visit Again#########################");
	    }
	}
	while(i!=0);
	}
}


