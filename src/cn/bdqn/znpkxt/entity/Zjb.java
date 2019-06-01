package cn.bdqn.znpkxt.entity;

/**
 * 章节类
 * 
 * @author Lenovo
 * 
 */
public class Zjb {

	private int id;// 主键
	private String name;// 章节名称
	private int kcId;// 书本名称--外键
	private int planKs;// 总课时
	private char status;// 状态：1可用 0不可用
	private int ks;// 学时
	private char type;// 在机房上或在教室上
	private int sx;// 上课顺序

	public Zjb() {
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

	public int getKcId() {
		return kcId;
	}

	public void setKcId(int kcId) {
		this.kcId = kcId;
	}

	public int getPlanKs() {
		return planKs;
	}

	public void setPlanKs(int planKs) {
		this.planKs = planKs;
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

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getSx() {
		return sx;
	}

	public void setSx(int sx) {
		this.sx = sx;
	}

}
