package cn.bdqn.znpkxt.entity;

/**
 * 角色类
 * 
 * @author Lenovo
 * 
 */
public class Role {

	private int id;// 角色主键
	private String roleName;// 角色名称
	private char status;// 角色状态

	public Role() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
