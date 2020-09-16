package cn.glieen.service.impl;

import cn.glieen.entity.User;
import cn.glieen.service.TestService;
import cn.glieen.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Glieen glieen1995@gmail.com
 */
@Service
public class TestServiceImpl implements TestService {
    private final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @DubboReference
    private UserService userService;

    @Override
    public User test() {
        User user = userService.get();
        logger.info("customer: {}", user);
        return user;
    }
}
