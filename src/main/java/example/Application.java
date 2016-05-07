package example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public ObjectMapper directFieldAccess()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable( SerializationFeature.INDENT_OUTPUT);
        mapper.setVisibility( PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY );
        mapper.setVisibility( PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE );
        mapper.setVisibility( PropertyAccessor.SETTER, JsonAutoDetect.Visibility.NONE );
        return mapper;
    }
}
