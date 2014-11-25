package javaheight.feature.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressions {

	Runnable r1 = () -> System.out.println(this);
	Runnable r2 = () -> System.out.println(toString());
	
	@Override
	public String toString() {
		return super.toString() + "--> Test";
	}
	
	public static void main(String[] args) {
		LambdaExpressions le = new LambdaExpressions();
		
		le.r1.run();
		le.r2.run();
		
		String [] values = {"z", "e", "h" , "m", "a"};
		
		Arrays.sort(values, (String s1, String s2) -> s1.toString().compareTo(s2.toString()));
		
		printArray(values);
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg1.toString().compareTo(arg0.toString());
			}
		};
		
		Arrays.sort(values, comparator);
		
		printArray(values);
	}
	
	static void printArray(String [] values) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < values.length; i++) {
		   result.append( values[i] );
		}
		System.out.println(result.toString());
	}
}
