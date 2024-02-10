package com.selenium.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility_select_methods {
	public static void sele_option(WebElement ele,Object data)
	{
		Select sele = utility_object.Select_object(ele);
		if(data instanceof Integer)
		{
			sele.selectByIndex((Integer)data);
		}
		else if(data instanceof String)
		{
			try
			{
				sele.selectByValue((String)data);
			}
			catch(Exception e) {
				sele.selectByVisibleText((String)data);
			}
		}
	}
	public static void desel_option(WebElement ele,Object data) {
		Select sel = utility_object.Select_object(ele);
		if(data instanceof Integer)
		{
			sel.deselectByIndex((Integer)data);
			}
		else if(data instanceof String)
		{
			try
			{
				sel.deselectByValue((String)data);
			}
			catch(Exception e) {
				sel.deselectByVisibleText((String)data);
			}
		}
	}
	public static void desel_all_opt(WebElement ele)
	{
		Select sel = utility_object.Select_object(ele);
		sel.deselectAll();
	}
	public static void sel_option(WebElement ele)
	{
		Select selop = utility_object.Select_object(ele);
		selop.getOptions();
	}
	public static void get_fis(WebElement ele)
	{
		Select sel = utility_object.Select_object(ele);
		sel.getFirstSelectedOption();
	}
	public static void get_all(WebElement ele)
	{
		Select sel = utility_object.Select_object(ele);
		sel.getAllSelectedOptions();
	}
	public static void isMul(WebElement ele)
	{
		Select sel = utility_object.Select_object(ele);
		sel.isMultiple();
	}
}
	