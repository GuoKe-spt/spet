package cn.com.nobility.po;


import lombok.Data;

/**
 * @author: spt
 * @description:
 * @date: 2019/5/15 11:12
 */
@Data
public class User {

    private String id;
    private String name;
    private String userName;
    private String passWord;
    private String phone;
    private String email;
    private String sex;
    private String address;
    private Integer age;
}
