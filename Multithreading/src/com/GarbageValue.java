package com;
public class GarbageValue {
   @Override 
   public void finalize()
   {
	   System.out.println("Kaam Ho Gaya");
   }
   public static void main(String[] args) {
	 //1st way to call Garbage Collector
	   //new GarbageValue();
	   //2nd way to call Garbage Collector
	   //GarbageValue obj = new GarbageValue();
	   //obj = null;
       //3rd way to call Garbage Collector
	   GarbageValue obj = new GarbageValue();
	   GarbageValue obj2 = new GarbageValue();
	   obj = obj2;
	   System.gc();
	}

}
