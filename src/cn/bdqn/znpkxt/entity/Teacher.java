package cn.bdqn.znpkxt.entity;

/**
 * 教师类
 * 
 * @author Lenovo
 * 
 */
public class Teacher {

	private int id;// 教师主键
	private String name;// 教师姓名
	private char sex;// 教师性别
	private char type;// 类型\教员、班主任、教职经理、学术经理、校长、财务、人事、后勤等等
	private char fxId;// 方向表外键
	private char status;// 状态 1在职 2离职
	private String xl;// 学历
	private String byxx;// 毕业学校
	private String remark;// 备注
	private int deptId;// 部门表外键

	public Teacher() {
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public char getFxId() {
		return fxId;
	}

	public void setFxId(char fxId) {
		this.fxId = fxId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public String getByxx() {
		return byxx;
	}

	public void setByxx(String byxx) {
		this.byxx = byxx;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
