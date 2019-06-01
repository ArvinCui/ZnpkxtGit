package cn.bdqn.znpkxt.entity;

/**
 * 临时排课类
 * 
 * @author Lenovo
 * 
 */
public class PkTemp {

	private int id;// 临时排课主键
	private int bjId;// 班级外键
	private int kbId;// 课本外键
	private int zjId;// 章节外键
	private int ks;// 课时
	private int tid;// 教师外键
	private int jsId;// 教室外键
	private String pkTime;// 排课日
	private String createTime;// 创建时间
	private String updateTime;// 修改时间

	public PkTemp() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBjId() {
		return bjId;
	}

	public void setBjId(int bjId) {
		this.bjId = bjId;
	}

	public int getKbId() {
		return kbId;
	}

	public void setKbId(int kbId) {
		this.kbId = kbId;
	}

	public int getZjId() {
		return zjId;
	}

	public void setZjId(int zjId) {
		this.zjId = zjId;
	}

	public int getKs() {
		return ks;
	}

	public void setKs(int ks) {
		this.ks = ks;
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

	public String getPkTime() {
		return pkTime;
	}

	public void setPkTime(String pkTime) {
		this.pkTime = pkTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
