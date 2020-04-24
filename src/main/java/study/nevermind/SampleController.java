package study.nevermind;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/sample")
    public String msg (Model model){
        model.addAttribute("data","Welcome to Nevermind !!");
        return "sample";
    }
}
