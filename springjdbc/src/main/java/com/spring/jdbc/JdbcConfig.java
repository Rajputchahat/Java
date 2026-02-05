package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StuDaoImplementation;
import com.spring.jdbc.dao.StudentDao;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class JdbcConfig {
	
    @Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Root");
		return ds;
	}
    
    @Bean("jdbcTemplate")
    public JdbcTemplate gettemplate() {
    	JdbcTemplate temp = new JdbcTemplate();
    	temp.setDataSource(getDataSource());
		return temp;
    }
    
    //Manually declaration of Bean of StuDaoImplementation(Without Using @Autowired annotation)
//    @Bean("sdi")
//    public StudentDao getSdi() {
//    	StuDaoImplementation sdi = new StuDaoImplementation();
//    	sdi.setJdbctemp(gettemplate());
//		return sdi;
//    }

    
    
    
    
}
