package com.hendisantika.springbootuserregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/20
 * Time: 08.21
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring Boot User Registrasion" + LocalDate.now();
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}


