package model2;

public class AddProduct {
		//Instance variable
	  
	    private int id,price,qty;
	    private String name;
	    //Setter
	    public void setId(int id){
	    	this.id = id;
	    }
	    public void setName(String name) {
	    	this.name = name;
	    }
	    public void setPrice(int price) {
	    	this.price = price;
	    }
	    public void setQty(int qty) {
	    	this.qty = qty;
	    }
	    //Getter
	    public int getId() {
	    	return id;
	    }
	    public String getName() {
	    	return name;
	    }
	    public int getPrice() {
	    	return price;
	    }
	    public int getQty() {
	    	return qty;
	    }
	}
