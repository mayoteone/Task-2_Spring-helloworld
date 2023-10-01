import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean.equals(bean1));

        System.out.println("------------");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getName());
        System.out.println(catBean.equals(catBean1));

    }
}