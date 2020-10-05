package com.hendisantika.springbootuserregistration.controller;

import com.hendisantika.springbootuserregistration.service.ConfirmationTokenService;
import com.hendisantika.springbootuserregistration.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

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
}
