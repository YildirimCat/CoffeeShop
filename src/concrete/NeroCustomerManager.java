package concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {

        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            try {
                throw new Exception("Not a valid person");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
