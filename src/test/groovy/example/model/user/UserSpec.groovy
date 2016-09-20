package example.model.user

import example.TestConfiguration
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = TestConfiguration.class)
class UserSpec extends Specification
{
    @Unroll
    def "ユーザーが作成できること"(){

        when:
        // 木本さんの社員番号
        EmployeeNumber employeeNumber = new EmployeeNumber( "0001" );


        // 木本さんの社員番号が0001であること
        then:
        employeeNumber == "0001"
    }
}
