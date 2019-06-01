package cn.bdqn.znpkxt.dao.teacher;

import cn.bdqn.znpkxt.entity.Teacher;

/**
 * 教师接口
 * @author Yang
 *
 */
public interface TeacherMapper {

	/**
	 * 添加新教师
	 * @param teacher
	 * @return
	 */
	Integer addNewTeacher(Teacher teacher);
}
