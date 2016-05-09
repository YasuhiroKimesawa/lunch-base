package example.dataaccess.customer;

import example.model.customer.Customer;
import example.model.customer.CustomerId;
import example.model.customer.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDataSource implements CustomerRepository
{
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerId nextId()
    {
        return new CustomerId( customerMapper.nextId() ) ;
    }

    @Override
    public Customer findById( CustomerId customerId )
    {
        return customerMapper.findById( customerId );
    }
}
