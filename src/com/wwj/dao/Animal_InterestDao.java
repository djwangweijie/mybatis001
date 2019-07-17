package com.wwj.dao;

import java.util.List;

import com.wwj.model.Animal;
import com.wwj.model.Interest;
/**
 * 多对多第三方接口
 * @author Yun
 *
 */
public interface Animal_InterestDao {

	/**
	 * 根据兴趣id查看有多少用户选择
	 * @param iid
	 * @return
	 */
	List<Animal> getAnimalByIid(int iid);
	
	/**
	 * 根据用户id查看有当前用户有哪些兴趣
	 * @param aid
	 * @return
	 */
	List<Interest> getInterestByAid(int aid);
}
