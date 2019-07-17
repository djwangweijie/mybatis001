package com.wwj.model;

import java.io.Serializable;
import java.util.List;

public class Animal implements  Serializable {
	    private static final long serialVersionUID = 6315662516417216377L;
		private int  aid;
		private String aname;
		private List<Interest>  interests;
		public List<Interest> getInterests() {
			return interests;
		}
		public void setInterests(List<Interest> interests) {
			this.interests = interests;
		}
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		
}
