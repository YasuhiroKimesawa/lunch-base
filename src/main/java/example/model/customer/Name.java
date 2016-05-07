package example.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
class Name
{
    private String familyName;

    private String firstName;

    Name( @JsonProperty("familyName") String familyName
            , @JsonProperty("firstName") String firstName )
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }
}
