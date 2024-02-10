package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
	public static void mouse_hover(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).moveToElement(ele).perform();
	}
	public static void mouse_hover_click(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).moveToElement(ele).click(ele).perform();
	}
	public static void right_click(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).contextClick(ele).perform();
	}
	public static void double_click(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).doubleClick(ele).perform();
	}
	public static void Drag_drop(WebDriver driver,WebElement ele,WebElement tgt)
	{
		utility_object.Actions_object(driver).dragAndDrop(ele, tgt).perform();
	}
}
