package login;



import com.ResponseData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface LoginService {

    @RequestMapping(value = "/getUserInfo")
    ResponseData getUserInfo(@RequestBody String username);
}
