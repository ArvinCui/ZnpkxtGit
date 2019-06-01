package cn.bdqn.znpkxt.entity;

/**
 * 菜单类
 * 
 * @author Lenovo
 * 
 */
public class Menu {

	private int id;// 菜单主键
	private int parentId;// 父级菜单
	private String menuName;// 菜单名称
	private String menuPath;// 菜单路径
	private char status;// 菜单是否可用
	private String createDate;// 菜单创建时间

	public Menu() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuPath() {
		return menuPath;
	}

	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
