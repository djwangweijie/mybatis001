package com.wwj.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wwj.model.TestUser;

public interface TestUserDao {

	/**
	 *  依次为if /whereif  / set /(whenchoose)/foreach
	 * @param msg
	 * @return
	 */
	TestUser getUser(Map msg);
	TestUser getUserUseWhere(Map msg);
	TestUser updateUserById(Map msg);
	TestUser selectUserByChoose(Map msg);	
	List<TestUser> selectUserByListId(List ids);
	
	
}
