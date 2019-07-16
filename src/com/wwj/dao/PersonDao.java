package com.wwj.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wwj.model.Person;

/**
 * person层的操作
 * 
 * @author Yun
 *
 */
public interface PersonDao {
	/**
	 * 新增用户
	 * 
	 * @param p
	 *            传入需要新增的对象
	 * @return 0,1代表结果
	 */
	int savePerson(Person p);

	/**
	 * 更新用户对象
	 * @param p 需要被更新的对象
	 * @return 0,1代表结果
	 */
	int updatePerson(Person p);

	/**
	 * 根据用户id进行删除
	 * @param id  唯一用户id
	 * @return  0，1代表结果
	 */
	int  deletePersonById(int  id);
	
	/**
	 * 获取所有的信息
	 * @return  所有的人员信息
	 */
	List<Person>  getPersonInfos();
	
	/**
	 * 根据名字和id查询信息
	 * @param name
	 * @param id
	 * @return
	 */
    List<Person>  getPersonInfosByNameAndID(String name ,int id);
    
    /**
     *  根据map进行查询
     * @param attrs
     * key1 id  key2 name
     * @return
     */
    List<Person>  getPersonInfosByMap(Map attrs);
    
    /**
     * 根据用户唯一id查询信息
     * @param id
     * @return
     */
    Person  getPersonInfo(@Param("pid") int id);
    
    /**
     * sql片段
     * @param id  根据用户的id查询姓名
     * @return
     */
    String  getPersonName(@Param("pid") int id);
	
    /**
     * 获取用户的名片信息
     * @return
     */
    List<Person>  getPersonsOfCard();
}
