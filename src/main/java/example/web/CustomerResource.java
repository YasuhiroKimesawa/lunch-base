package example.web;

import example.model.customer.Customer;
import example.model.customer.CustomerId;
import example.service.customer.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "customer" )
public class CustomerResource
{
    @Autowired
    private CustomerService customerService;

    @RequestMapping( value = "", method = RequestMethod.GET )
    public Customer customer()
    {
        Customer customer = customerService.findBy( new CustomerId( (long)1 ) );

        return customer;
    }

    @RequestMapping( value = "", method = RequestMethod.POST )
    public ResponseEntity<Customer> register( @RequestBody Customer customer )
    {
        Customer newCustomer = customerService.register( customer );

        return new ResponseEntity<>( newCustomer, HttpStatus.CREATED );
    }
}
