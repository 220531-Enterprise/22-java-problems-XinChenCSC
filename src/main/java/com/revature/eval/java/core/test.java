package com.revature.eval.java.core;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.revature.eval.java.core.EvaluationService.SpeedConverter;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		System.out.println(SpeedConverter.toMilesPerHour(2));
//		System.out.println(SpeedConverter.printConversion(1.5));
		EvaluationService a = new EvaluationService();
//		System.out.println(a.printMegaBytesAndKiloBytes(2500));
//		System.out.println(a.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//		System.out.println(a.areEqualByThreeDecimalPlaces(3.0, 3.0));
//		System.out.println(a.printYearsAndDays(1051200));
	
//		double x = -3.1756;
//		BigDecimal y = new BigDecimal(x).setScale(3, RoundingMode.DOWN);
//		System.out.println(y);
//		double firstNum = -3.1756;
//		double secondNum = -3.175;
//		BigDecimal num1 = new BigDecimal(firstNum).setScale(3, RoundingMode.DOWN);
//		BigDecimal num2 = new BigDecimal(secondNum).setScale(3, RoundingMode.DOWN);
//		System.out.println(num1 + " " + num2);
//		System.out.println(a.reverse("example"));
		

//		EvaluationService.Triangle triangle = new EvaluationService.Triangle(5,4,6);
//		System.out.println(triangle.isIsosceles());
		
//		System.out.println(a.cleanPhoneNumber("+1 (613)-995-0253"));
//		String str = "123-abc-7890";
//		
//
//		String res = str.replaceAll("[\\D]", "");
//		if(res.length() == 11) {
//			res = res.substring(1);
//		}
//
//	
//		System.out.println(res);  
//		String phrase = "one,\ntwo,\nthree";
//		String phrase2 = "one,two,three";
//		
		
		
//		
//		String[] ignored = phrase2.split("[^a-zA-Z0-9]");
//		Map<String,Integer> map = new HashMap<>();
//		for ( String s : ignored) {
//	
//			s = s.replaceAll("[^a-zA-Z]", "");
//			if(s.equals("")) continue;
//		
//		    if (map.containsKey(s)) {
//		        map.put(s, map.get(s) + 1);
//		    } else {
//		        map.put(s, 1);
//		    }
//		}
//		
//		System.out.println(map);
//		int input = 5;
//		int res = 0;
//		// count the length of digit one way is to convert the input to string and use length method
//		int length  = (input + "").length();
//		
//		// we need a while loop until traverse through all the digit by % 10 and /10
//		while (input > 0) {
//			int digit = input % 10;
//			input /= 10;
//			res += Math.pow(digit, length);
//		}
//		
//		
//		System.out.println( "res = " +res + " input = " + input + " " + (res == input));
//		String str = "five boxing wizards jump quickly at it";
//		
//		String[] strArray = str.toLowerCase().replaceAll("[\\W]+", "").split("");
//
//		Set<String> mySet = new HashSet<String>(Arrays.asList(strArray));
//		System.out.println(mySet.size());
//		int res = 0;
//		HashSet<Integer> set = new HashSet<Integer>();
//		set.add(5);
//		set.add(6);
//		set.add(8);
//		int[] set = {5,6,8}; 
//		int minNum = Arrays.stream(set).min().getAsInt();
//		int num = 150;
//		
//		for(int x = minNum; x< num; x++) {
//			for(int n: set) {
//				if (x % n == 0) {
//					res +=x;
//					break;
//					
//				} 
//			}
//		}
//		System.out.println(res);
//		long num = 9L;
//		List<Long> 	factors = new ArrayList<>();
//		for (long i =2; i <= num / i; i++) {
//			
//			while(num % i == 0) {
//				factors.add(i);
//				num /= i;
//			}
//			
//		}
//		if (num > 1) factors.add(num);
//		System.out.println(factors);
//
		
//		System.out.println(a.acronym("Complementary metal-oxide semiconductor"));
		for(int x =0; x < 20; x++) {
			
			System.out.println(a.guessingGame(1, 10));
			
		}


	}
	

}
