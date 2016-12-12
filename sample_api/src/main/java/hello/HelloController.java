package feeder;

import java.util.Map;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.GET)
    public Response hello(@RequestParam Map<String, String> queryParameters) {

	ArrayList<Item> items = new ArrayList<>();
	items.add(new Item("hoge1", 1000));
	items.add(new Item("hoge2", 2000));

	return new Response(200, "success", items);
    }
}
