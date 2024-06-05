package StudentResult.withoutConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program start" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp1 = context.getBean("emp",Employee.class);
        System.out.println(emp1);
        System.out.println("program end");
        
    }
}
