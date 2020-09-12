import entity.Person;
import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    private static ApplicationContext applicationContext = null;
    static{
        applicationContext = new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void propertyTest1(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student)applicationContext.getBean("student");
        Student student2 = applicationContext.getBean(Student.class);
        System.out.println(student);
        System.out.println(student2);
    }

    /**
     * 通过 property 属性赋值
     */
    @Test
    public void propertyTest2(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Person person = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person==person2);
    }

    /**
     * 通过 有参构造方法  为bean 赋值
     */
    @Test
    public void propertyTest3(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student bean = (Student)applicationContext.getBean("student2");
        System.out.println(bean);
    }

    @Test
    public void propertyTest4(){
        Person person2 = (Person)applicationContext.getBean("person2");
        System.out.println(person2);
    }
}
