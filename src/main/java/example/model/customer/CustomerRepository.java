package example.model.customer;

public interface CustomerRepository
{
    Customer findById( CustomerId customerId);
}
