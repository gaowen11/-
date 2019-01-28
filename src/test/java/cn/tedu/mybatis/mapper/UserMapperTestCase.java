package cn.tedu.mybatis.mapper;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.entity.User;
import cn.tedu.mybatis.vo.UserVO;

public class UserMapperTestCase {

	AbstractApplicationContext ac;
	UserMapper mapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		mapper = ac.getBean("userMapper", UserMapper.class);
		System.out.println(mapper);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
	@Test
	public void addnew() {
		User user = new User();
		user.setUsername("fancq");
		user.setPassword("666");
		Integer rows = mapper.addnew(user);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void findById() {
		Integer id = 14;
		User user = mapper.findById(id);
		System.out.println(user);
	}
	
	@Test
	public void findByUsername() {
		String username = "jack";
		User user = mapper.findByUsername(username);
		System.out.println(user);
	}
	
	@Test
	public void findAll() {
		List<User> users = mapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void getCount() {
		Integer count
			= mapper.getCount();
		System.out.println("count=" + count);
	}
	
	@Test
	public void deleteById() {
		Integer id = 6;
		Integer rows
			= mapper.deleteById(id);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void updatePassword() {
		Integer id = 14;
		String password = "666";
		
		Integer rows
			= mapper.updatePassword(id, password);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void deleteByIds() {
		Integer[] ids = { 2,1,5,8,9,10,12,14,4 };
		Integer rows = mapper.deleteByIds(ids, null);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void find() {
		String where = "username='mike'";
		String orderBy = null;
		Integer offset = null;
		Integer count = null;
		List<User> users = mapper.find(where, orderBy, offset, count);
		System.out.println("BEGIN:");
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("END.");
	}
	
	@Test
	public void findAll2() {
		List<UserVO> list = mapper.findAll2();
		System.out.println("BEGIN:");
		for (UserVO userVO : list) {
			System.out.println(userVO);
		}
		System.out.println("END.");
	}
	
}




