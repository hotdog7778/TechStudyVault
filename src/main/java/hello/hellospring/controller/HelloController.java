package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){ // 스프링이 모델이란것을 만들어줌
        model.addAttribute("data", "haha!!"); //model 에다가 data, tgkim 이라는 키 밸류 데이터를 넣어줬음.
        return "hello"; // templates의 hello.html 로 가라는 뜻
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name); // name키에 name 벨류
        return "hello-template";
    }
    // @RequestParam("name") >> 파라미터로 name을 받는다는 말이고 요청하는곳에서 파라미터를 넘겨줘야 한다는것임 아래는 URL로 파라미터를 넘겨준것
    // 파라미터로 받은 name의 값은 매개변수 String name에 담긴다. 그리고 그 name은 model에 담긴다.
    // http://localhost:8080/hello-mvc?name=spring!!!

    @GetMapping("hello-string")
    @ResponseBody // body에 리턴값을 바로 넣어주겠다. view같은게 필요없음
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody // Json 반환이 기본값
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName("김태균");
        return hello; // json 형식의 객체가 리턴되어 브라우저 화면에 출력
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
