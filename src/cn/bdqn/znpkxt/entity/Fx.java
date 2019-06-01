package cn.bdqn.znpkxt.entity;

/**
 * 方向类
 * 
 * @author Lenovo
 * 
 */
public class Fx {

	private int id;// 方向主键
	private String name;// 方向名称
	private char status;// 状态：1可用 0不可用

	public Fx() {
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
