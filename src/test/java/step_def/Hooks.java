package step_def;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void launchBrowser(){
        System.out.println("===Launching browser===");
    }
    @After
    public void closeBrowser(){
        System.out.println("=====CLOSE BROWSE=====");
    }
}
