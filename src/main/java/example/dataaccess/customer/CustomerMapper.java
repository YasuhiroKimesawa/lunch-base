package example.dataaccess.customer;

import example.model.customer.Customer;
import example.model.customer.CustomerId;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper
{
    @Select ("select nextval('customer.customer_id')")
    Long nextId();

    Customer findById( @Param( "customerId" ) CustomerId customerId );

    void registerCustomer( @Param( "customer") Customer customer );
}
