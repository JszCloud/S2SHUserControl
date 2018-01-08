package cn.name.control.entity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
public class ChartData extends HibernateDaoSupport {
    @Autowired
    public final void setSF(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

}
