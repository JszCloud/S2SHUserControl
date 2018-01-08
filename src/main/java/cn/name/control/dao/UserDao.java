package cn.name.control.dao;

import cn.name.control.entity.Page;
import cn.name.control.entity.User;

import java.util.List;

/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll(User user, Page page);

    /**
     * 根据id查询
     * @param user
     * @return
     */
    List<User> findById(User user);

    /**
     * 添加
     * @return
     */
    int save(User user);

    /**
     * 修改
     * @return
     */
    int update(User user);

    /**
     * 删除
     * @return
     */
    void delect(User user);

    /**
     * 分页
     * @param user
     * @return
     */
    Integer page(User user);
}
