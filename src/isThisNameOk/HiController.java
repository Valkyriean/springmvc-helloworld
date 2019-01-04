package isThisNameOk;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // 这里导入了一个Model类
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("name","YEEEEEEEE"); // 指定Model的值
        return "say";
    }
}