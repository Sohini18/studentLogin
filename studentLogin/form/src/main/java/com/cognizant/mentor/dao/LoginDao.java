package com.cognizant.caseStudy.dao;

import com.cognizant.caseStudy.modal.User;

public interface LoginDao {
	User getUser(String name);
}
