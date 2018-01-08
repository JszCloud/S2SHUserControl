package cn.name.control.service;

import cn.name.control.entity.Page;
import cn.name.control.entity.User;

import java.util.List;

/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> selectAll(Page page);

    /**
     * 根据id查找
     * @return
     */
    List<User> selectById(User user);

    /**
     *
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除
     * @param user
     */
    void remove(User user);
}
