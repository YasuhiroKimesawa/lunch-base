package example.model.customer;

public interface CustomerRepository
{
    CustomerId nextId();

    Customers findAll();

    Customer findBy( CustomerId customerId);

    Customer register( Customer customer );
}
