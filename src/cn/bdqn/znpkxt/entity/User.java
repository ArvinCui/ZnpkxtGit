package cn.bdqn.znpkxt.entity;

import java.util.Date;

/**
 * 用户类
 * 
 * @author Lenovo
 * 
 */
public class User {

	private int id;// 用户主键
	private String accountNo;// 账号
	private String password;// 密码
	private int roleId;// 角色ID
	private int ryId;// 人员编号--外键
	private Date lastLogintime;// 最后登录时间

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getRyId() {
		return ryId;
	}

	public void setRyId(int ryId) {
		this.ryId = ryId;
	}

	public Date getLastLogintime() {
		return lastLogintime;
	}

	public void setLastLogintime(Date lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

}
