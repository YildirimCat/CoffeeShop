import Abstract.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;


public class Main {
    public static void main(String[] args){

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Yıldırım","Çat",1998,"00000000000"));

        BaseCustomerManager customerManager1 = new NeroCustomerManager(new CustomerCheckManager());
        customerManager1.save(new Customer(1,"Yıldırım","Çat",1990,"00000000000"));

    }
}
