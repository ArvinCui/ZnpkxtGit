package cn.bdqn.znpkxt.entity;

/**
 * 学期类
 * 
 * @author Lenovo
 * 
 */
public class Xq {

	private int id;// 学期编号
	private String name;// 学期名称
	private char status;// 状态：1可用 0不可用

	public Xq() {
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
