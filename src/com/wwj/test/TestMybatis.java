package com.wwj.test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wwj.model.Animal;
import com.wwj.model.Interest;
import com.wwj.model.Person;
import com.wwj.model.Post;
import com.wwj.model.TestUser;
import com.wwj.model.User;

/**
 * 测试mybatis的CRUD操作
 * 
 * @author wwj
 *
 */
public class TestMybatis {
	public static void main(String[] args) throws IOException, ParseException {
		/*
		 * 日期上面的处理
		 */
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sf.format(new Date());
		Date parse = sf.parse(format);

		InputStream is = Resources.getResourceAsStream("mybatisCfg.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		// 生成 session
		SqlSession session = build.openSession();
		// 操作数据
		Map map  = new HashMap<>();
		map.put("tname", "001");
		map.put("tage", 18);
		map.put("tid", 1);
//		int rs  = session.update("updateUserById", map);
//		System.out.println(rs);
//		TestUser t = session.selectOne("selectUserByChoose", map);
//		System.out.println(t.getTname());
//		List ids = new ArrayList<>();
//		ids.add(1);ids.add(2);ids.add(3);
//		List<TestUser>  ts = session.selectList("selectUserByListId", ids);
//		System.out.println(ts.size());
		
		List<Animal>  as =session.selectList("getAnimals");
		System.out.println(as.get(0).getAname());
		List<Animal>  ass =session.selectList("getAnimals");
		System.out.println(as.get(0).getAname());
		
		// 提交事务
		session.commit();
		// 关闭 session
		session.close();
		System.out.println("---------------------------分割线利于观察");
		//关闭了之后数据会放入缓存中
		//测试二级缓存
		SqlSession session1 = build.openSession();
		List<Animal>  asss =session1.selectList("getAnimals");
		System.out.println(as.get(0).getAname());
		// 提交事务
		session1.commit();
		// 关闭 session
		session1.close();
		
		
	}
}
