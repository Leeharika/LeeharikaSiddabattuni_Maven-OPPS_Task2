package io.epam.task.MavenOOPs;
public class Gifts1 
{
	public void chocolates()
	{
		System.out.println("Chocolates");
	}
	public void sweets()
	{
		System.out.println("Sweets");
	}
}
class Gifts2 extends Gifts1
{
	public void chocolates()
	{
		System.out.println("Dairy Milk");
	}
	public String sweets(String sweet)
	{
		return sweet;
	}
	public int add(int no_of_chocolates,int no_of_sweets)
	{
		return 10*no_of_chocolates + 20*no_of_sweets;
	}
	public int add(int no_of_chocolates,int no_of_sweets,int no_of_cookies)
	{
		return 10*no_of_chocolates + 20*no_of_sweets + 25*no_of_cookies;
	}
}
abstract class Cookies
{
	public abstract void distribute();
}
class Distribution extends Cookies
{
	public void distribute()
	{
		System.out.println("Cookies have been distributed");
	}
}
