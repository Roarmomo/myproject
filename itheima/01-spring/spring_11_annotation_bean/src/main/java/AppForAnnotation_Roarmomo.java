
import com.roarmomo.config.RoarmomoConfig;
import com.roarmomo.dao.RoarmomoDao;
import com.roarmomo.service.RoarmomoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation_Roarmomo {
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(RoarmomoConfig.class);

        RoarmomoDao dao = (RoarmomoDao)ctx.getBean("RoarmomoDao");
        dao.save();
        System.out.println(dao);
        RoarmomoService service = (RoarmomoService) ctx.getBean("RoarmomoService");
        service.save();
        System.out.println(service);



    }
}
