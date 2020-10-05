package com.hendisantika.springbootuserregistration.controller;

import com.hendisantika.springbootuserregistration.entity.User;
import com.hendisantika.springbootuserregistration.service.ConfirmationTokenService;
import com.hendisantika.springbootuserregistration.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/20
 * Time: 08.05
 */
@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final ConfirmationTokenService confirmationTokenService;

    @GetMapping("/sign-in")
    String signIn() {

        return "sign-in";
    }

    @GetMapping("/sign-up")
    String signUpPage(User user) {

        return "sign-up";
    }
}
