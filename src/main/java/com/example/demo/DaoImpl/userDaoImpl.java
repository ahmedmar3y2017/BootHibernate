package com.example.demo.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.userDao;
import com.example.demo.Entities.User;


@Transactional
@Component
public class userDaoImpl implements userDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getAll() {
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(User.class);
		List<User> list =criteria.list();
		return list;
	}
}
