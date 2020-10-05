package com.hendisantika.springbootuserregistration.service;

import com.hendisantika.springbootuserregistration.repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/20
 * Time: 08.00
 */
@Service
@AllArgsConstructor
class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;
}
