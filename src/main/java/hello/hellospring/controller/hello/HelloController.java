package hello.hellospring.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
    model.addAttribute("data", "hello!!");
    return "hello"; // template 폴더에 hello 파일을 찾아 렌더링 -> 컨트롤러에서 리턴 값으로 문자를 반환하면 viewResolver가 화면을 찾아서 처리
    }
}
