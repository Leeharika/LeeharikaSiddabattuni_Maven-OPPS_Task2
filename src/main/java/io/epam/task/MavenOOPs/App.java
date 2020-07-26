package io.epam.task.MavenOOPs;
public class App 
{
    public static void main( String[] args )
    {
    	Gifts1 a=new Gifts1();
		a.chocolates();
		a.sweets();
		Gifts2 b=new Gifts2();
		b.chocolates();
		System.out.println(b.sweets("Gulab Jamun"));
		Gifts2 d=new Gifts2();
		System.out.println(d.sweets("Rasmalai"));
		Gifts2 e=new Gifts2();
		System.out.println(e.sweets("Kheer"));
		System.out.println("Weight of each chocolate is 10grams");
		System.out.println("Weight of each sweet is 20grams");
		System.out.println("Weight of each cookie is 25grams");
		System.out.println("Weight of each gift containing sweets and chocolates is"+" "+b.add(10,2)+" grams");
		System.out.println("Weight of each gift containing sweets,chocolates and cookies is"+" "+b.add(10,2,5)+" grams");
		Cookies c=new Distribution();
		c.distribute();
    }
}
