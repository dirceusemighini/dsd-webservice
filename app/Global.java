import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import play.GlobalSettings;
import play.Application;

/**
 * Created by dirceu on 9/16/14.
 */
public class Global extends GlobalSettings {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    @Override
    public void onStart(Application app) {
        super.onStart(app);
        context.start();
    }

    @Override
    public void onStop(Application app) {
        context.stop();
        super.onStop(app);
    }
}

