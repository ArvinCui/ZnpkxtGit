package cn.bdqn.znpkxt.entity;

/**
 * 排课特殊情况类
 * 
 * @author Lenovo
 * 
 */
public class PkTsb {

	private int id;// 主键
	private String tsDate;// 特殊不排课日期
	private String bhs;// 班号字符串
	private String remark;// 备注

	public PkTsb() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTsDate() {
		return tsDate;
	}

	public void setTsDate(String tsDate) {
		this.tsDate = tsDate;
	}

	public String getBhs() {
		return bhs;
	}

	public void setBhs(String bhs) {
		this.bhs = bhs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
