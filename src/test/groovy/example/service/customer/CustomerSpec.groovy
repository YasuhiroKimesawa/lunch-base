package example.service.customer

import example.TestConfiguration
import example.model.customer.CustomerId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = TestConfiguration.class)
@ActiveProfiles("test")
class CustomerSpec extends Specification {
    @Autowired
    private CustomerService customerService;

    def "指定のCustomerIDで顧客情報が取得できること"(){
        when:
        def customer = customerService.findBy( new CustomerId( 1 ) )

        then:
        customer.fullName() == "柏木 陽介"

    }
}
