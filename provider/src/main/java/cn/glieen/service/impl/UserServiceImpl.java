package cn.glieen.service.impl;

import cn.glieen.entity.User;
import cn.glieen.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Glieen glieen1995@gmail.com
 */
@Service
@DubboService
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User get() {
        User user = new User();
        user.setName("Glieen");
        user.setAge(24);
        logger.info("provider: {}", user);
        return user;
    }
}
