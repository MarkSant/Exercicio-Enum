public class OrderItem
{
	private int quantity;
	private double price;
	private Product product;
	
	public OrderItem (){
		
	}
	
	public OrderItem(int sQuantity, double sPrice, Product sProduct){
		this.quantity = sQuantity;
		this.price = sPrice;
		this.product = sProduct;
	}
	
	public int getQuantity (){
		return quantity;
	}
	
	public void setQuantity(int sQuantity){
		quantity = sQuantity;
	}
	
	public double getPrice (){
		return price;
	}
	
	public void setPrice (double sPrice){
		price = sPrice;
	}
	
	public Product getProduct (){
		return product;
	}
	
	public void setProduct (Product sProduct) {
		product = sProduct;
	}
	
	public double subTotal (){
		return Double.valueOf(quantity)*price;
	}

	@Override
	public String toString()
	{
		
		return product.getName() 
		+ ", $" 
		+ product.getPrice() 
		+ ", Quatity - " 
		+ quantity 
		+ ", Subtotal - $" 
		+ quantity * price;
		

	}
	
	 
}

