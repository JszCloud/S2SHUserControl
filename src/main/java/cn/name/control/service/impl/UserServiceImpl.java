package cn.name.control.service.impl;

import cn.name.control.dao.UserDao;
import cn.name.control.entity.Page;
import cn.name.control.entity.User;
import cn.name.control.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Nominal on 2018/1/3 0003.
 * 微博：@李明易DY
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<User> selectAll(Page page) {

        List<User> list=userDao.findAll(null,page);
        page.setSum(userDao.page(null));
        return list;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    /**
     * 根据id查找
     *
     * @param user
     * @return
     */
    @Override
    public List<User> selectById(User user) {
        return userDao.findById(user);
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    /**
     * 删除
     *
     * @param user
     */
    @Override
    public void remove(User user) {
        userDao.delect(user);
    }


}
