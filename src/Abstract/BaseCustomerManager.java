package Abstract;

import entities.Customer;

public abstract class  BaseCustomerManager implements Abstract.CustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to DB : " + customer.getFirstName());
    }
}
