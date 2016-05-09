package example.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
public class Customer
{
    private CustomerId customerId;

    private Name name;

    public Customer( @JsonProperty ("customerId")CustomerId customerId
            , @JsonProperty("name")Name name )
    {
        this.customerId = customerId;
        this.name = name;
    }

    public Customer()
    {
    }
}
