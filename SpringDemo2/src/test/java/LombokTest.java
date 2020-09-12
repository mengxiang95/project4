import entity.Person;
import org.junit.Test;

public class LombokTest {

    @Test
    public void personTest(){
        Person person = new Person();
        person.setId(1);
        person.setUsername("张三");
        person.setAge("男");
        System.out.println(person);
    }
}
