package MyMap;

import java.util.HashMap;
import java.util.Map;
public class TestHashMap {

	public static void main(String[] args) {
	   HashMap<String , String> map = new HashMap<String , String>();
       map.put("Brand", "BMW");
       map.put("Model","2025");
       map.put("Price","800000/-");
       //It does not allow duplicate key but allow duplicate value
       //map.put("Model", "2036");
       //map.put("Xprice","800000/-");
       
       System.out.println(map); 
       
       //read all the element
       System.out.println("*********************************");
       System.out.println("KEY\tVALUE");
       System.out.println("*********************************");
       for(Map.Entry<String , String> data:map.entrySet()) {
    	   System.out.println(data.getKey()+"\t"+data.getValue());
       }  
	}
}
