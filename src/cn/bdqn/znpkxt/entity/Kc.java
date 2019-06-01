package cn.bdqn.znpkxt.entity;

/**
 * 课程类
 * 
 * @author Lenovo
 * 
 */
public class Kc {

	private int id;// 课程主键
	private String name;// 书本名称
	private int fxId;// 方向--外键
	private int xqId;// 学期--外键
	private char status;// 状态：1可用 0不可用
	private int ks;// 该课程的总学时

	public Kc() {
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

	public int getFxId() {
		return fxId;
	}

	public void setFxId(int fxId) {
		this.fxId = fxId;
	}

	public int getXqId() {
		return xqId;
	}

	public void setXqId(int xqId) {
		this.xqId = xqId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public int getKs() {
		return ks;
	}

	public void setKs(int ks) {
		this.ks = ks;
	}

}
