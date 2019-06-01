package cn.bdqn.znpkxt.entity;

/**
 * 机房与教师关系类
 * 
 * @author Lenovo
 * 
 */
public class TeacherJs {

	private int id;// 主键
	private int tid;// 教师外键
	private int jsId;// 教室外键
	private String time1;//与机房排课起始时间
	private String time2;//与机房排课截止时间
	private char status;//状态  1当前可用  0不可用

	public TeacherJs() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getJsId() {
		return jsId;
	}

	public void setJsId(int jsId) {
		this.jsId = jsId;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
