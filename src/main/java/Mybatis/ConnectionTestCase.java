package Mybatis;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTestCase {
	
	MapperScannerConfigurer msc;
	SqlSessionFactoryBean ssfb;
	
	@Test
	public void gets() throws SQLException{
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		
		DataSource dataSource = ac.getBean("dataSource",DataSource.class);
		System.out.println(dataSource.getConnection());
		ac.close();
		
	}
}
