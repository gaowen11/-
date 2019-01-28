package cn.tedu.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mybatis.entity.User;
import cn.tedu.mybatis.vo.UserVO;

public interface UserMapper {

	Integer addnew(User user);
	
	User findById(Integer id);
	
	User findByUsername(String username);
	
	List<User> findAll();
	
	Integer getCount();
	
	Integer deleteById(Integer id);
	
	Integer updatePassword(
		@Param("id") Integer id, 
		@Param("password") String password);
	
	Integer deleteByIds(
		@Param("ids") Integer[] ids,
		@Param("str") String str);
	
	List<User> find(
		@Param("where") String where, 
		@Param("orderBy") String orderBy, 
		@Param("offset") Integer offset, 
		@Param("count") Integer count);
	
	List<UserVO> findAll2();
	
}





