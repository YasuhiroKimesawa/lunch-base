package example.web.user;
//htmlと関連しているクラスと定義
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mac48 on 2016/09/13.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("")
    public String createUser()
    {
        return "";
    }

}
