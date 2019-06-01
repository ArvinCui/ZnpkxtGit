package cn.bdqn.znpkxt.entity;

/**
 * 角色菜单类
 * 
 * @author Lenovo
 * 
 */
public class RoleMenu {

	private int id;// 角色菜单权限主键
	private int roleId;// 角色id外键
	private int menuId;// 菜单id外键
	private String createDate;// 创建时间

	public RoleMenu() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
