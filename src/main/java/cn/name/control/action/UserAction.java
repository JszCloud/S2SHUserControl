package cn.name.control.action;

import cn.name.control.entity.Page;
import cn.name.control.entity.User;
import cn.name.control.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
@Component
public class UserAction {
    @Autowired
    UserService userService;
    private User user;
    private Page page = new Page();
    private List<User> list=new ArrayList<>();
    private String message;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String to_save(){
        return "save";
    }
    /**
    *添加用户
    */
    public String do_save(){
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        int row=userService.save(user);
        if (row>0){
            message="添加成功";
        }else {
            message="添加失败";
        }
        return "list";
    }

    /**
     * 查询用户列表
     * @return
     */
    public  String list(){
        list=userService.selectAll(page);
        for (User user1 : list) {
            System.out.println(user1);
        }
        System.out.println(page);
        return "list";
    }

    /**
    *用户信息详情
    */
    public String info(){

        list=userService.selectById(user);
        for (User user1 : list) {
            user=user1;
        }
        return "info";
    }

    /**
    *到修改用户信息页
    */
    public String to_edit(){
        list=userService.selectById(user);
        return "edit";
    }

    /**
    *修改用户信息
    */
    public String do_edit(){
        int row=userService.update(user);
        if (row>0){
            message="修改成功";
        }else {
            message="修改失败";
        }
        return "edit";
    }

    /**
     * 删除用户信息
     */
    public String del(){
        userService.remove(user);
        return "list";
    }
}
