package example.dataaccess.customer;

import example.model.customer.Customer;
import example.model.customer.CustomerId;
import example.model.customer.CustomerRepository;

import example.model.customer.Customers;
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
    public Customers findAll()
    {
        return new Customers( customerMapper.findAll() );
    }

    @Override
    public Customer findBy( CustomerId customerId )
    {
        return customerMapper.findById( customerId );
    }

    @Override
    public Customer register( Customer customer )
    {
        long newId = customerMapper.nextId();

        Customer newCustomer = customer.createdCustomer( newId );

        customerMapper.registerCustomer( newCustomer );

        return newCustomer;
    }


}
