package factory;

public class Client {
	public static void main(String[] args)
	{
		CustomerFactory cf=new CustomerFactory();
		Customer c1=cf.getCustomer("senior citizen");
		Customer c2=cf.getCustomer("first time");
		Customer c3=cf.getCustomer("regular");
		c1.getType();
		c2.getType();
		c3.getType();
	}

}
 