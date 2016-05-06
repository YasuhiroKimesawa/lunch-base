package example.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
public class Name
{
    private String familyName;

    private String firstName;

    public Name( @JsonProperty("familyName") String familyName
            , @JsonProperty("firstName") String firstName )
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }
}
