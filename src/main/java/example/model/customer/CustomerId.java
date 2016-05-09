package example.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
public class CustomerId
{
    private Long value;

    public CustomerId( @JsonProperty("value") Long value )
    {
        this.value = value;
    }

    public CustomerId()
    {
    }
}
