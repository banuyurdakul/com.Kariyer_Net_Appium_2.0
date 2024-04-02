package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver()  {

        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        if (driver == null) {

            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName(ConfigReader.getProperty("platformName"))
                    .setPlatformVersion(ConfigReader.getProperty("androidVersion"))
                    .setDeviceName(ConfigReader.getProperty("deviceName"))
                    .setAutomationName(ConfigReader.getProperty("automationName"))
                    .setAppPackage(ConfigReader.getProperty("appPackage"))
                    .setAppActivity(ConfigReader.getProperty("appActivity"))
                    .setNoReset(false);

            assert appiumServerURL != null;
            driver = new AndroidDriver(appiumServerURL, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }


        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}