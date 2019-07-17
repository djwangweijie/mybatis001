package com.wwj.dao;

import java.util.List;

import com.wwj.model.User;

/**
 * 进行1对多的操作
 * @author Yun
 *
 */
public interface UserDao {

	/**
	 * 获取用户的信息和所发的帖子
	 * @return
	 */
    List<User> getUsers();
}
