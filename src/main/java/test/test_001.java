package test;


import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test_001  {

  /*  public test_001() {


    }

    @Test
    public void Test_001_suhas() {

        GotoHomepage();

    }*/


    public static void main(String[] args) {

       //WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","C:/Users/suhas/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
   //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // driver.get("https://www.google.com/");
    }


}
