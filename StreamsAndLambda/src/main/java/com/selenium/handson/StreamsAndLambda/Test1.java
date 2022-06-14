package com.selenium.handson.StreamsAndLambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import io.netty.handler.codec.http.HttpHeaders.Names;

/**
 * Hello world!
 *
 */
public class Test1 
{
	@Test
	public void filterList() {
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Amisha");
		list.add("Chetan");
		list.add("Bhavesh");
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void streamFilter() {
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Amisha");
		list.add("Chetan");
		list.add("Bhavesh");
		
		long count = list.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(count);
		
		long d = Stream.of("Adam","Amisha","Chetan","Bhavesh").filter(s->
			s.startsWith("A")).count();
		
		System.out.println(d);
		
		//print all names length > 4
		list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//prints only first length >4
		list.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap() {
		
		//to modify the result of filter use map.
		Stream.of("Adam","Amisha","Chetan","Bhavesh").filter(s->
		s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	
//		Stream.of("Adam","Amisha","Chetan","Bhavesh").filter(s->
//		s.endsWith("a")).forEach(s->System.out.println(s.toUpperCase()));

		//sorting names.
		List<String> names = Arrays.asList("Adam","Amisha","Chetan","Bhavesh");		
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		
		// merging two streams
		List<String> names1 = Arrays.asList("John","Visha","Sain","Sip");
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
		
				
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Sip"));
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect() {
		List<String> list = Stream.of("Adam","Amisha","Chetan","Bhavesh").filter(s->s.startsWith("A"))
							.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list.get(0));
	
		
		
		//print unique numbers and sorted 
		
		List<Integer> arr = Arrays.asList(4,4,5,2,1,1,3,5);
				
		arr.stream().distinct().sorted().forEach(num->System.out.println(num));


		//print particular index
		List<Integer> result = arr.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(result.get(3));

	}

}
