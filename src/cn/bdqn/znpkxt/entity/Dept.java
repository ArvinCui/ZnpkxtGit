package cn.bdqn.znpkxt.entity;

/**
 * 部门类
 * 
 * @author Lenovo
 * 
 */
public class Dept {

	private int id;// 部门主键
	private String name;// 部门名称
	private char status;// 状态：1可用 0不可用

	public Dept() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
