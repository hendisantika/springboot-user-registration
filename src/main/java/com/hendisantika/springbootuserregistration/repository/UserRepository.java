package com.hendisantika.springbootuserregistration.repository;

import com.hendisantika.springbootuserregistration.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/20
 * Time: 07.57
 */
@Repository
interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
