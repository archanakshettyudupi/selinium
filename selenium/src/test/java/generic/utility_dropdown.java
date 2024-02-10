package generic;

import org.openqa.selenium.WebElement;

public class utility_dropdown {
	public static void selectby_index(WebElement ele,int x)
	{
		utility_object.Select_object(ele).selectByIndex(x);
	}
	public static void selectby_value(WebElement ele,String value)
	{
		utility_object.Select_object(ele).selectByValue(value);
	}
	public static void selectby_visitxt(WebElement ele,String txt)
	{
		utility_object.Select_object(ele).selectByVisibleText(txt);
	}
	public static void deselectby_index(WebElement ele,int x)
	{
		utility_object.Select_object(ele).deselectByIndex(x);
	}
	public static void deselectby_value(WebElement ele,String value)
	{
		utility_object.Select_object(ele).deselectByValue(value);
	}
	public static void deselectby_visitxt(WebElement ele,String txt)
	{
		utility_object.Select_object(ele).deselectByVisibleText(txt);
	}
	public static void deselectall(WebElement ele)
	{
		utility_object.Select_object(ele).deselectAll();
	}
	}


