
package webevents;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web applicattion context is initalized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web application context is destroyed");
    }
}
