package com.stark.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stark.app.mappers.UserMapper;
import com.stark.app.model.User;
import com.stark.app.service.IUserService;

/**
 * User Service
 * @author stark
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int saveVo(User vo) throws Exception {
		int result = -1;
		try {
			result = this.userMapper.save(vo);
		} catch (Exception e) {
			throw new Exception("新增出错!");
		}
		return result;
	}

	@Override
	public int deleteVo(String id) throws Exception {
		int result = -1;
		try {
			result = this.userMapper.delete(id);
		} catch (Exception e) {
			throw new Exception("删除出错!");
		}
		return result;
	}

	@Override
	public int modifyVo(User vo) throws Exception {
		int result = -1;
		try {
			result = this.userMapper.modify(vo);
		} catch (Exception e) {
			throw new Exception("修改出错!");
		}
		return result;
	}

	@Override
	public User findById(String id) throws Exception {
		User result = null;
		try {
			result = this.userMapper.findById(id);
		} catch (Exception e) {
			throw new Exception("查询出错!");
		}
		return result;
	}

	@Override
	public List<User> findAll() throws Exception {
		List<User> result = new ArrayList<User>();
		try {
			result = this.userMapper.findAll(new HashMap<String, Object>());
		} catch (Exception e) {
			throw new Exception("查询出错!");
		}
		return result;
	}

}
