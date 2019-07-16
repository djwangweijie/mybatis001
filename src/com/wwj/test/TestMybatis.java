package com.wwj.test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wwj.model.Person;

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
		List<Person> persons = session.selectList("getPersonsOfCard");
		for (Person person : persons) {
			System.out.println(person.getCards().get(0).getCname());
			System.out.println(person.getCards().get(1).getCname());
		}
		// 提交事务
		session.commit();
		// 关闭 session
		session.close();
		
	}
}
