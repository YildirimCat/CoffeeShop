package adapters;

import Abstract.CustomerCheckService;
import entities.Customer;
import mernis.LARKPSPublicSoap;


public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        LARKPSPublicSoap client = new LARKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula( Long.parseLong(customer.getNationalId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
