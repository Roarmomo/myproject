// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.roarmomo.config.RoarmomoSpringConfig;
import com.roarmomo.domain.RoarmomoBFO;
import com.roarmomo.service.RoarmomoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RoarmomoMain {
    public RoarmomoMain() {
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(new Class[]{RoarmomoSpringConfig.class});
        RoarmomoService roarmomoService = (RoarmomoService)ctx.getBean(RoarmomoService.class);
        RoarmomoBFO roarmomoBFO = new RoarmomoBFO();
        roarmomoBFO.setName("陈龙");
        roarmomoBFO.setYear("2023");
        roarmomoBFO.setMonth("03");
        roarmomoBFO.setIncomepre("20000");
        RoarmomoBFO result = roarmomoService.queryByName(roarmomoBFO);
        System.out.println(result.toString());
    }
}
