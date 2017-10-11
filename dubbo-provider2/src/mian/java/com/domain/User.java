package com.domain;
import java.io.Serializable;


/**
 * @描述 : 
 * @创建者 : guoxiaopeng
 * @创建时间 : 2017-7-11 下午12:46:27
 */
public class User implements Serializable {  
    private static final long serialVersionUID = 1L;  
    private int age;  
    private String name;  
    private String sex;  
  
    public User() {  
        super();  
    }  
  
    public User(int age, String name, String sex) {  
        super();  
        this.age = age;  
        this.name = name;  
        this.sex = sex;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getSex() {  
        return sex;  
    }  
  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
  
}  