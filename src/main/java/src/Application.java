package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 30337
 */
@SpringBootApplication
@Controller
@ServletComponentScan
public class Application {
    @RequestMapping("/")
    public String SayHello() {
        return "forward:/managerlogin";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
