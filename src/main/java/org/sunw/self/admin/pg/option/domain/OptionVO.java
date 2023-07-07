package org.sunw.self.admin.pg.option.domain;

public class OptionVO {
	
	
	Integer pgOptionId;
	Integer pgId;
	String pgOptionName;
	String pgOptionContent;
	Integer pgOptionPric;
	
	public void setpgOptionId(Integer pgOptionId) {
		this.pgOptionId= pgOptionId;
	}
	public Integer getpgOptionId() {
		return this.pgOptionId;
	}
	
	
	public void setpgId(Integer pgId) {
		this.pgId=pgId;
	}
	public Integer getpgId() {
		return this.pgId;
	}

}
