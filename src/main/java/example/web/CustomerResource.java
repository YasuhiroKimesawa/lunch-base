package example.web;

import example.model.customer.Customer;
import example.model.customer.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "customer" )
public class CustomerResource
{
    @Autowired
    private CustomerFactory customerFactory;

    @RequestMapping( value = "", method = RequestMethod.GET )
    public Customer customer()
    {
        Customer customer = customerFactory.create( 1, "田中", "達也" );

        return customer;
    }

    @RequestMapping( value = "", method = RequestMethod.POST )
    public Customer register( @RequestBody Customer customer )
    {
        return customer;
    }
}
