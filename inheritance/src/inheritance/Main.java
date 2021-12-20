package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ozge = new IndividualCustomer();
		ozge.customerNumber ="12345";
		
		IndividualCustomer ekin = new IndividualCustomer();
		ekin.customerNumber ="96321";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="67890";
		
		CorporateCustomer softWare = new CorporateCustomer();
		softWare.customerNumber ="5556612";
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(hepsiBurada);
		customerManager.add(ozge);*/
		
		Customer[] customers = {ozge, ekin, softWare, hepsiBurada};
		
		customerManager.addMutiple(customers);
	}
}
