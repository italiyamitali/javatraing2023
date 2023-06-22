package javatraing2023;

import java.util.HashMap;
import java.util.Map;

public class StringArrayDemo {

	public static void main(String[] args) {
		 
		String para = "Good handwriting involves forming letters properly and spacing the letters carefully within words "
				      + "Letters should not be squeezed together  but they should not be spread far apart either "
				      + "It is also important to form letters the correct height "
				      + "Capital letters should be larger than lower case letters . ";
		
		// para in uppercase
		para = para.toUpperCase();
		
		System.out.println(para);
		
		System.out.println("--------------");
		//para in lowercase:
		
		para = para.toLowerCase();
		
		System.out.println(para);
		
		System.out.println("---------------");
		
		// total number of words in para:
		
		String[] array = para.split(" ");
		
		System.out.println(array.length);
		
		System.out.println("---------------");
		
		// reverse the whole string:
		
		StringBuffer ab = new StringBuffer(para);
		System.out.println(ab.reverse());
		
		System.out.println("----------------");
		
		//find the numbers of duplicate words:
		
		String [ ]g = para.split(" ");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String st:g) {
			Integer old = map.get(st);
			
			if(map.get(st)== null) {
				map.put(st, 1);
			}else
				map.put(st,map.get(st) +1);
			
		}
		System.out.println(map);
		
						

	}

}
