package example.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
class CustomerId
{
    private Integer value;

    CustomerId( @JsonProperty("value") Integer value )
    {
        this.value = value;
    }
}
