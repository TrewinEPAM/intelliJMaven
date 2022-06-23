package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        WebDriver webd = new ChromeDriver();
        WebElement webE = webd.findElement(By.cssSelector(".cas"));


        assertTrue( true );
    }

    @org.testng.annotations.Test
    public void testNGMethod(){
        System.out.println("Testing on testNG with IntelliJ IDE");
    }
}
