package cn.glieen.controller;

import cn.glieen.entity.User;
import cn.glieen.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Glieen glieen1995@gmail.com
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("test")
    public User get() {
        return testService.test();
    }
}
