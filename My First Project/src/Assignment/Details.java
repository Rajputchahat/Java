package Assignment;

public class Details {
    int id,price,qty;
	String name;
	//setter
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
    public void setQty(int qty)
    {
    	this.qty = qty;
    }
    //getter
    public int getId()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    public int getPrice()
    {
    	return price;
    }
    public int getQty()
    {
    	return qty;
    }
}
