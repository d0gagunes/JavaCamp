package inheritance;

public class Main {

	public static void main(String[] args) {
	   IndividualCustomer engin=new IndividualCustomer();
	   engin.customerNumber="12345";
	   
	   
	   CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="25374";
		
		UnionCustomer abc=new UnionCustomer();
		abc.customerNumber="48484";
	    
	 CustomerManager customerManager=new CustomerManager();
		Customer [] customers = {engin, abc, hepsiBurada};
		
		
		  customerManager.addMultiple(customers);
		  
	}
	  
}
