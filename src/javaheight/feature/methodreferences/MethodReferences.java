package javaheight.feature.methodreferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static boolean isInteger(String value) {
		try {
			Integer.valueOf(value);
			
			return true;
		}
		catch(NumberFormatException exception) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		List<String> values = Arrays.asList("0.2", "8" , "2.223");
		
		System.out.println(values.stream().filter(MethodReferences::isInteger).count());
	}
}
