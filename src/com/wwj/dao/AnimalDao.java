package com.wwj.dao;

import java.util.List;

import com.wwj.model.Animal;

public interface AnimalDao  {

	/**
	 * 获取用户信息
	 * @return
	 */
	List<Animal>  getAnimals();
}
