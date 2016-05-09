package example.model.customer;

public interface CustomerRepository
{
    CustomerId nextId();

    Customer findById( CustomerId customerId);
}
