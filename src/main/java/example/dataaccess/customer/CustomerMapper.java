package example.dataaccess.customer;

import example.model.customer.Customer;
import example.model.customer.CustomerId;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper
{
    @Select ("select nextval('customer.customer_id')")
    Long nextId();

    List<Customer> findAll();

    Customer findById( @Param( "customerId" ) CustomerId customerId );

    long registerCustomer( @Param( "customer") Customer customer );
}
