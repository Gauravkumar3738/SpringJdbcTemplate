package SpringJdbcTemplate.SpringJdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate  jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e){
		String query1="insert into employee values" 
				+ "('"+e.getid()+"','"+e.getName()+"','"+e.getPass()+"','"+e.getSalary()+"')";

		return jdbcTemplate.update(query1);

	}

	 public int deleteEmployee(Employee e){

			String query2 = "delete from employee where id="+e.getid();
			return jdbcTemplate.update(query2);

		}
	 public int searchEmployee(Employee e){
		 
	 String query3="select * from employee where id=?" 
				+ "('"+e.getid()+"','"+e.getName()+"','"+e.getPass()+"','"+e.getSalary()+"')";
		 return jdbcTemplate.update(query3);
		 
	 }
/*	 
	 public int updateEmployee(Employee e){
		 
		 String query3="update employee set name=? where id=?";
			 return jdbcTemplate.update(query3);
		 }
		 
		 */
}
