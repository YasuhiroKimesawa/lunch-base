package example

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan(basePackages = "example.datasource")
class TestConfiguration
{
    public static void main(String[] args)
    {
        SpringApplication.run(TestConfiguration.class, args);
    }
}
