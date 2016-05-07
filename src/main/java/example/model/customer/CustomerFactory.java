package example.model.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerFactory
{
    public Customer create( Integer id, String familyName, String firstName )
    {
        CustomerId customerId = new CustomerId( id );
        Name name = new Name( familyName, firstName );

        return new Customer( customerId, name );

    }
}
