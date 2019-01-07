import com.plekhanov.implementation.Toyota;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:SpringConfiguration.xml")
@PropertySource("classpath:springProperties.xml")
public class MyTest {

    @Autowired
    ApplicationContext applicationContext;


    @Test
    public void toyotaTest() {
        applicationContext.getBean(Toyota.class).drive();
    }
}
