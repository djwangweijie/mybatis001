package com.wwj.dao;

import java.util.List;

import com.wwj.model.Animal;
import com.wwj.model.Interest;

public interface InterestDao {

	/**
	 * 获取兴趣信息
	 * @return
	 */
	List<Interest>  getInterests();
}
