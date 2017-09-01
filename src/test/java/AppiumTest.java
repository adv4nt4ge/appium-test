import capabilities.AppiumCapabilities;
import org.junit.*;
import org.junit.rules.TestName;
import org.testobject.appium.junit.TestObjectTestResultWatcher;

import java.io.IOException;

public class AppiumTest extends AppiumCapabilities {

    @Before
    public void setUp() throws Exception {
        setting();
//        driver.switchTo().alert().accept();
    }
//
//    @AfterClass
//    public static void tearDownClass() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Test
    public void test() throws IOException {
        Sleeper.pause(20);
        System.out.println("Good job");
    }

}
