package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    static Actions action;

    static {
        action = new Actions(Driver.getDriver());
    }


    public static void goToLogin() throws InterruptedException {
        Driver.getDriver().findElement(By.id("com.kariyer.androidproject:id/btn_login")).click();
        Thread.sleep(3000);
    }


    public static void scrollDown() {

    }

    public static void scrollUp() {

    }

    public static String getScreenShot(String fileName) throws IOException {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + fileName + date + ".png";
        File finalDestination = new File(target);
        //FileUtils.copyFile(source, finalDestination);
        return target;


    }

    public static void wait(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}



