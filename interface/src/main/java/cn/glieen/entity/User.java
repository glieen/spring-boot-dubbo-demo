package cn.glieen.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Glieen glieen1995@gmail.com
 */
@Data
public class User implements Serializable {
    private String name;

    private Integer age;
}
