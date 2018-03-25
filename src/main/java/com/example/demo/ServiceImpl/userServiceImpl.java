package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DaoImpl.userDaoImpl;
import com.example.demo.Entities.User;
import com.example.demo.Service.userService;

@Service
public class userServiceImpl implements userService {

	 @Autowired
	 userDaoImpl userDao;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
