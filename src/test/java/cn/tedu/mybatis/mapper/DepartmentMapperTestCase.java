package cn.tedu.mybatis.mapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.vo.DepartmentVO;

public class DepartmentMapperTestCase {

	AbstractApplicationContext ac;
	DepartmentMapper mapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		mapper = ac.getBean("departmentMapper", DepartmentMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
	@Test
	public void findById() {
		Integer id = 2;
		DepartmentVO data
			= mapper.findById(id);
		System.out.println(data);
	}
	
}




