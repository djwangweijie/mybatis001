package com.wwj.dao;

import java.util.List;

import com.wwj.model.Post;

/**
 * 多对一上面的操作
 * @author Yun
 *
 */
public interface PostDao {

	/**
	 * 获取所有帖子信息
	 * @return
	 */
	List<Post>  getPosts();
}
