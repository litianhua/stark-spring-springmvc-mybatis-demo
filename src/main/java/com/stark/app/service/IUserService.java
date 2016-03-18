package com.stark.app.service;

import java.util.List;

import com.stark.app.model.User;

public interface IUserService {

	/**
	 * 保存User对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int saveVo(User vo) throws Exception;
	
	/**
	 * 根据id删除对象
	 * @param id
	 * @throws Exception
	 */
	public int deleteVo(String id) throws Exception;
	
	/**
	 * 修改对象
	 * @param vo
	 * @throws Exception
	 */
	public int modifyVo(User vo) throws Exception;
	
	/**
	 * 根据id获取User对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findById(String id) throws Exception;
	
	/**
	 * 查找所有的对象
	 * @return
	 * @throws Exception
	 */
	public List<User> findAll() throws Exception;
	
}
