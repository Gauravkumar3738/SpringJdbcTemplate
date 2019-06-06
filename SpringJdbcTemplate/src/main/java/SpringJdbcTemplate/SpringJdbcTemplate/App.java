package SpringJdbcTemplate.SpringJdbcTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        
        Employee e=(Employee) context.getBean("emp");
     /*  e.setid(101);
        e.setName("Ramesh");
        e.setPass("pass");
        e.setSalary(10000);
        
        e.setid(102);
        e.setName("Jogesh");
        e.setPass("1234");
        e.setSalary(20000);
        
        
        e.setid(103);
        e.setName("Deepesh");
        e.setPass("56789");
        e.setSalary(30000);
       */ 
        EmployeeDao dao= (EmployeeDao)context.getBean("edao");
        int status=dao.saveEmployee(e);
        System.out.println("done...");
        
      //  int status1=dao.deleteEmployee(e); //for delete
        
        int status2=dao.searchEmployee(e);
      
       // int status3=dao.updateEmployee(e);
        
    }
}
