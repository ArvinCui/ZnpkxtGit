package cn.bdqn.znpkxt.entity;

/**
 * 教室类
 * 
 * @author Lenovo
 * 
 */
public class Js {

	private int id;// 教室主键
	private String name;// 机房名
	private int type;// 1.机房 2.教室
	private char status;// 状态：1可用 0不可用
	private int fxId;// 方向--外键

	public Js() {
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public int getFxId() {
		return fxId;
	}

	public void setFxId(int fxId) {
		this.fxId = fxId;
	}

}
