package com.java.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

// creating a custom functional interface
interface customAdditionInterface {
	int sum(int a, int b);
}

public class Java8Practice {

	public static void main(String[] args) {

		// sum add = (a, b) -> (a + b);
		// int result = add.sum(7, 9);

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		int result = add.apply(8, 2);

		System.out.println("Sum of two numbers: " + result);

		// creating the list of integer
		List<Integer> num = Arrays.asList(1, 2, 4, 7, 8, 9, 24, 45, 3);

		// filtering even numbers from the list
		List<Integer> evenNumberList = num.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even number list: " + evenNumberList);

		// mapping the elements of the list to their squares
		List<Integer> mappedList = num.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Squared elements of the list: " + mappedList);

		// mappedList.stream().forEach(e -> System.out.print(e + " "));
		// finding the maximum value of the list
		// int max = Collections.max(num);
		int max = num.stream().max(Integer::compare).get();
		System.out.println("Maximum value of the list : " + max);

		int min = num.stream().min(Integer::compareTo).get();
		System.out.println("Minimum value of the list : " + min);

		// sorting the list
		List<Integer> sortedList = num.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list : " + sortedList);

		// counting the element of the list
		long numberOfElements = num.stream().count();
		System.out.println("Total number of elements in the list : " + numberOfElements);

		// reducing the list into a single integer
		int reducedList = num.stream().reduce(0, (a, b) -> (a + b));
		System.out.println("Reduced list to their sum : " + reducedList);

		// printing the length of the strings of the list
		List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Guava", "Mango");
		System.out.print("Length of the strings of the list: ");

		words.forEach(word -> System.out.print(word.length() + " "));

		System.out.println();

		// printing the distinct list
		List<Integer> distinctList = num.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct List : " + distinctList);

		// printing the list of words in alphabetical orders
		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list of words in alphabetical orders: " + sortedWords);

		// checking the value in optional
		Optional<String> optional = Optional.ofNullable("Java");

		String value = optional.orElse("Optional is empty");
		System.out.print("Value present in optional : " + value);

		System.out.println();

		// grouping the strings of words based on their length
		Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Grouping by length: " + grouped);

		// printing the square of the list into a new list
		List<Integer> squareList = num.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Square List: " + squareList);

		// applying limit to list and skiping the some element
		System.out.print("List upto 4 elements : ");
		num.stream().limit(4).forEach(e -> System.out.print(e + " "));

		System.out.println();

		// finding the first element of the list
		int firstElement = num.stream().sorted().findFirst().get();
		System.out.println("First elemnet of the list after sorting: " + firstElement);

		// Addition of two numbers by using custom functional interface
		customAdditionInterface addition = (a, b) -> a + b;
		int sum = addition.sum(7, 8);

		System.out.println("Sum of two number : " + sum);

		// to print characters from lists of strings
		List<List<String>> lists = Arrays.asList(Arrays.asList("Saurabh", "Shalini"), Arrays.asList("Pammy", "Jyoti"));

		List<String> combinedList = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Flattened List: " + combinedList);

		// to create and print result from a CompletableFuture asynchronously
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 2 + 2);
		System.out.print("By Completable Future : ");

		future.thenAccept(System.out::print);

		System.out.println();

		// to check if any number in a list is even
		boolean check = num.stream().anyMatch(i -> i % 2 == 0);
		System.out.println("Even number is present or not : " + check);

		// printing the counts of the elements of the list
		Map<String, Long> wordFrequencyMap = words.stream().map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		System.out.println(wordFrequencyMap);
	}

}
