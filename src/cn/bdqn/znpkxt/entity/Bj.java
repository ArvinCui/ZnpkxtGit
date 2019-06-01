package cn.bdqn.znpkxt.entity;

/**
 * 班级类
 * 
 * @author Lenovo
 * 
 */
public class Bj {

	private int id;// 班级编号
	private String name;// 班级名称
	private String bh;// 总部编号
	private String njId;// 学期编号--外键
	private String beginTime;// 开班时间
	private String endTime;// 毕业时间
	private int tid;// 教员
	private int bzr;// 班主任
	private int fxId;// 方向表--外键
	private String remark;// 备注
	private char status;// 状态：1可用 0不可用

	public Bj() {
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

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getNjId() {
		return njId;
	}

	public void setNjId(String njId) {
		this.njId = njId;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getBzr() {
		return bzr;
	}

	public void setBzr(int bzr) {
		this.bzr = bzr;
	}

	public int getFxId() {
		return fxId;
	}

	public void setFxId(int fxId) {
		this.fxId = fxId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
