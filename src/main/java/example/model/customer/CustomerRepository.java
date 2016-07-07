package example.model.customer;

public interface CustomerRepository
{
    CustomerId nextId();

    Customers findAll();

    Customer findById( CustomerId customerId);

    Customer register( Customer customer );
}
