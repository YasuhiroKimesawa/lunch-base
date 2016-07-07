package example.web;

import example.model.customer.Customer;
import example.model.customer.CustomerId;
import example.model.customer.Customers;
import example.service.customer.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "customer" )
public class CustomerResource
{
    @Autowired
    private CustomerService customerService;

    @RequestMapping( value = "", method = RequestMethod.GET )
    public Customers customers()
    {
        Customers customers = customerService.findAll();

        return customers;
    }

    @RequestMapping( value = "{id}", method = RequestMethod.GET )
    public Customer customer( @PathVariable ("id") Long id )
    {
        Customer customer = customerService.findBy( new CustomerId( id ) );

        return customer;
    }

    @RequestMapping( value = "", method = RequestMethod.POST )
    public ResponseEntity<Customer> register( @RequestBody Customer customer )
    {
        Customer newCustomer = customerService.register( customer );

        return new ResponseEntity<>( newCustomer, HttpStatus.CREATED );
    }
}
