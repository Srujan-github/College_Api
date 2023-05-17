package in.srujan.college_api.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import in.srujan.college_api.model.Colleges;
 
 
@Repository
public class CollegeDAOImpl implements CollegeDAO {
	@Autowired(required=false) private JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3305/collegeapi");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
	@Override
	public int save(Colleges college) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Colleges> getAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM tbl_colleges",new BeanPropertyRowMapper<Colleges>(Colleges.class));
//		return null;
	}

	@Override
	public List<Colleges> getByCourse_name(String name) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM tbl_colleges WHERE course_name=?",new BeanPropertyRowMapper<Colleges>(Colleges.class),name);
		 
	}

}
