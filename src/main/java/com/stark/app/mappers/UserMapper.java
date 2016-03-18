package com.stark.app.mappers;

import java.util.List;
import java.util.Map;

import com.stark.app.model.User;

/**
 * 用户对象数据接口
 * @author stark
 */
public interface UserMapper {

	/**
	 * 新增一条记录
	 * @param vo
	 * @return
	 */
	public int save(User vo);

	/**
	 * 删除一条记录
	 * @param id
	 * @return
	 */
	public int delete(String id);
	
	/**
	 * 更新一条记录
	 * @param vo
	 * @return
	 */
	public int modify(User vo);
	
	/**
	 * 查询一条记录
	 * @param id
	 * @return
	 */
	public User findById(String id);
	
	/**
	 * 根据map参数获取列表
	 * @param map
	 * @return
	 */
	public List<User> findAll(Map<String, Object> map);
	
}