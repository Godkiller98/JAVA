package TestNG.assign01;


import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Streaminjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stubX
//		WebDriverManager.chromedriver().setup(); 
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<String> arr1 = Arrays.asList("Rohit", "Jack", "christopher", "Rahul");
		arr1.forEach(n->System.out.println(n));
		
		arr1.stream().filter(s -> s.startsWith("R")).forEach(s -> System.out.println(s));
		System.out.println(
				"------------------------------------STARTS WITH J---------------------------------------------------------------------");
		Stream.of("Jack", "John", "Ryan").filter(s -> s.startsWith("J")).limit(1).forEach(s -> System.out.println(s));
		System.out.println(
				"-------------------------------lenght greater than 4--------------------------------------------------------------------------");
		arr1.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		System.out.println(
				"-------------------------------------ends with k--------------------------------------------------------------------");
		arr1.stream().filter(s -> s.endsWith("k")).forEach(s -> System.out.println(s));
		System.out.println(
				"-----------------------------------starts with r----------------------------------------------------------------------");
		arr1.stream().filter(s -> s.startsWith("R")).sorted().forEach(s -> System.out.println(s));
		System.out.println(
				"-----------------------------------length greater then 5 and uppercase----------------------------------------------------------------------");
		arr1.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		arr1.stream().filter(s -> s.startsWith("R")).sorted().forEach(s -> System.out.println(s));
		List<String> arr2 = Arrays.asList("Columbus", "Clinton", "John");
		Stream<String> arr3 = Stream.concat(arr2.stream(), arr1.stream());
		arr3.sorted().forEach(s -> System.out.println(s));
		
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		List<String> ls = arr1.stream().filter(s -> s.startsWith("R")).sorted().collect(Collectors.toList());
		System.out.println(ls.get(0));
		System.out.println(ls.size());
		ls.forEach(n->System.out.println(n));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		List<Integer> al = Arrays.asList(1,2,5,2,3,3,1,5);
		al.stream().distinct().sorted().forEach(s->System.out.println(s));
		al.stream().map(n->n*2).forEach(n->System.out.println(n));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		List <Integer> al2 = al.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(al2.get(2));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
List<Integer> array12 = Arrays.asList(6,7,5,6,2,4);
array12.stream().sorted().forEach(n->System.out.println(n));
		

	}
}
