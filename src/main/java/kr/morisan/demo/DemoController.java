package kr.morisan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @Autowired
    @GetMapping("/")
    public DemoDTO getDemo() {
        DemoDTO demoDTO = new DemoDTO("id", "password");
        return demoDTO;
    }
}
