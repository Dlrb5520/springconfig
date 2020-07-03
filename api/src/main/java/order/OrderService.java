package order;

import com.ResponseData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderService {

    @RequestMapping(value = "/getOrder")
    ResponseData getOrder(@RequestBody String OrderId);


    @RequestMapping(value = "/test")
    ResponseData test(@RequestBody String OrderId);
}
