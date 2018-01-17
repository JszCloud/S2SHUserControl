package cn.name.control.dao.impl;

import cn.name.control.dao.UserDao;
import cn.name.control.entity.Chart;
import cn.name.control.entity.ChartData;
import cn.name.control.entity.Page;
import cn.name.control.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nominal on 2018/1/3 0003.
 * 微博：@李明易DY
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    ChartData chartData;

    /**
     * 根据id查询
     *
     * @param user
     * @return
     */
    @Override
    public List<User> findById(User user) {

        return (List<User>)chartData.getHibernateTemplate().find("from User user where id=?",user.getId());

    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<User> findAll(User user, Page page) {
        //List<User> list=(List<User>)chartData.getHibernateTemplate().find("FROM User limit");
        List<User> list=(List<User>)chartData.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            public Object doInHibernate(Session session)
                    throws HibernateException {
                //在方法体中使用session对象
                String hql = "from User";
                Query query = session.createQuery(hql);
                int begin = (page.getPages() - 1)*page.getCut();
                query.setFirstResult(begin);
                query.setMaxResults(page.getCut());
                return query.list();
            }
        });
        return list;
    }

    /**
     * 添加
     *
     * @param user
     * @return
     */
    @Override
    public int save(User user) {
        Serializable row=chartData.getHibernateTemplate().save(user);
        return (Integer)row;
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @Override
    public int update(User user) {
        chartData.getHibernateTemplate().update(user.getName(),user);
        return 0;
    }

    /**
     * 删除
     *
     * @return
     */
    @Override
    public void delect(User user) {
        chartData.getHibernateTemplate().delete(user.getName(),user);
    }

    /**
     * 分页
     *
     * @param user
     * @return
     */
    @Override
    public Integer page(User user) {
         Integer p=chartData.getHibernateTemplate().find("from User").size();
        //System.out.println(p);
        return p;
    }

    @Override
    public Chart findChart(Chart chart) {
        Integer man=chartData.getHibernateTemplate().find("from User us where us.sex=?","男").size();
        Integer woman =chartData.getHibernateTemplate().find("from User us where us.sex=?","女").size();
        System.out.println(man+"+++00"+woman);
        chart.setMan(man);
        chart.setWoman(woman);
        return chart;
    }
}
