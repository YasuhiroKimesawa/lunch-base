package example.model.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerFactory
{
    @Autowired
    private CustomerRepository customerRepository;

    public Customer create( String familyName, String firstName )
    {
        CustomerId customerId = customerRepository.nextId();
        Name name = new Name( familyName, firstName );

        return new Customer( customerId, name );
    }
}
