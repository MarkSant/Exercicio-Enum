
import java.util.*;
import java.util.List;

public class Order
{
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List <OrderItem> orderList = new ArrayList<>();
	
	public Order (){
		
	}
	
	public Order (Date sMoment, OrderStatus sStatus, Client sClient){
		this.moment = sMoment;
		this.status = sStatus;
		this.client = sClient;
		
	}
	
	public Date getDate (){
		return moment;
	}
	
	public void setDate (Date sDate) {
		this.moment = sDate;
	}
	
	public OrderStatus getStatus(){
		return status;
		
	}
	
	public void setStatus(OrderStatus sStatus){
		this.status = sStatus;
	}
	
	public Client getClient (){
		return client;
	}
	
	public void setClient (Client sClient){
		this.client = sClient;
	}
	
	public void addItem (OrderItem item) {
		orderList.add(item);
		
	}
	
	public void removeItem (OrderItem item) {
		orderList.remove(item);
	}
	
	public List getOrderItList(){
		return orderList;
	}
	
	public Double total(){
		double sum = 0;
		for(int i = 1; i <= orderList.size() ; i++){
			sum =+ orderList.get(i).subTotal();
		}
		return sum;
	}

	
	
	
	
	}
