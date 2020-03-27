public class Product
{
	private String name;
	private Double price;
	
	public Product(){
		
	}
	
	public Product(String name, Double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName (){
		return name;
	}
	
	public void setName(String sName){
		name = sName;
	}
	
	public Double getPrice (){
		return price;
	}
	
	public void setPrice (Double sPrice){
		price = sPrice;
	}
	
}
