package com.cognizant.caseStudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.caseStudy.dao.LoginDao;
import com.cognizant.caseStudy.modal.User;

@Service
public class LoginService {
	@Autowired
	LoginDao loginDao;
	
	public boolean auth(String name, String passwword) {
		User user = loginDao.getUser(name);
		if(user==null)
			return false;
		return user.getPassword().equals(passwword);
	}
}
