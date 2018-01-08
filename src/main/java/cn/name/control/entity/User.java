package cn.name.control.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
@Component
@Entity
public class User {
    /**
    *编号
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
    *用户名
    */
    private String name;

    /**
    *邮箱
    */
    private String email;
    /**
    *性别
    */
    private String sex;
    
    /**
    *创建时间
    */
    private Date createDate;

    /**
    *更改时间
    */
    private Date updateDate;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }

    public User() {
    }

    public User(String name, String email, String sex, Date createDate, Date updateDate) {

        this.name = name;
        this.email = email;
        this.sex = sex;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public User(Integer id) {

        this.id = id;
    }

    public User(Integer id, String name, String email, String sex, Date createDate, Date updateDate) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
