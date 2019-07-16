package com.wwj.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 基本的模型类
 * @author wwj
 *对象序列化是一个用于将对象状态转换为字节流的过程，可以将其保存到磁盘文件中或通过网络发送到任何其他程序；从字节流创建对象的相反的过程称为反序列化。而创建的字节流是与平台无关的，在一个平台上序列化的对象可以在不同的平台上反序列化。
 *无需序列化的变量使用transient
 */
public class Person implements Serializable {
	//Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的
	//这里是用来表明版本的一致性
	private static final long serialVersionUID  = 1L;
	
	private  Integer   id;
	private  String name;
	private  Date bir;
	private  String address;
	
	private  List<Card>  cards;
	
	//自行get和set 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBir() {
		return bir;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	
	
	

}
