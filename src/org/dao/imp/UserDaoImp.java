package org.dao.imp;

import org.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImp implements UserDao{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addUser(User user) {
		try {
//			getHibernateTemplate().save(user);
			Session session = sessionFactory.openSession();
			Transaction ts = session.beginTransaction();
			
			session.save(user);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
