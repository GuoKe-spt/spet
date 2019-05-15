package cn.com.nobility.po;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author: spt
 * @description:
 * @date: 2019/5/15 11:12
 */
@Data
public class User {

    @NotBlank(message = "主键不能为空")
    private String id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "密码不能为空")
    private String passWord;

    private String phone;
    @Email(message = "邮箱格式不正确")
    private String email;

    private String sex;

    private Integer age;

    private String address;

}
