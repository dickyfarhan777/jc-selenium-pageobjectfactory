package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MainApp {
    private static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(URL);

        //Call Method from pages
        LoginPage loginPage = new LoginPage();
        loginPage.login("Admin", "admin123");
        System.out.println(loginPage.getTxtDashboard());

//        loginPage.logout();
//        loginPage.login("Admin123", "admin2");
//        System.out.println(loginPage.getTxtInvalid());
//
//        loginPage.login("","admin1234");
//        System.out.println(loginPage.getTxtRequired());
//        DriverSingleton.delay(4);
//
//        loginPage.login("Admin", "admin123");
//        System.out.println(loginPage.getTxtDashboard());



    }
}