package com.springcore.ci;

public class Person {
     private String name;
     private int personId;
     private Certi ct;
      
     public Person(String name, int personId,Certi ct){
    	 this.name = name;
    	 this.personId = personId;
    	 this.ct = ct;
     }

	@Override
	public String toString() {
		return this.name+" : "+this.personId + " {"+this.ct.name+"}";
	}
     
}
