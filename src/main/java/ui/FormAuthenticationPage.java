package ui;

import org.openqa.selenium.By;

public class FormAuthenticationPage {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//button[@class='radius']");
    public static By alertElement = By.id("flash");
}
