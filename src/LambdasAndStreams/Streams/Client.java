package LambdasAndStreams.Streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {

        //Terminal Operation (Terminate the stream flow / end of the flow) - collect, forEach, reduce -- It takes the stream and return the concrete value.

        //Intermediary Operation - filter(filter the flow), map(transform from one to another data) -- It takes the stream and return the stream.

        //Predicate<? super Integer> isEven = n -> n % 2 == 0;
        //Predicate<? super String> isNotStartWithT = s -> !(s.startsWith("T"));

        // 1. Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers1.forEach(n -> System.out.println(n*n));
        //numbers1.stream().map(n->n * n).forEach(System.out::println);
        numbers1.stream().map(n->n*n).forEach(System.out::println);
        //numbers1.stream().map(squareIt()).forEach(System.out::println);

        System.out.println("**********************END OF 1******************");

        //2. Find below a list of integers. Iterate over it and print every even number.
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers2.stream().filter(isEven).forEach(System.out::println);
        numbers2.stream().filter(n-> n%2==0).forEach(System.out::println);
        System.out.println("**********************END OF 2******************");

        //3. For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers3.stream().filter(isEven).collect(Collectors.toList()).forEach(System.out::println);
        //numbers3.stream().filter(Client::isEven).toList().forEach(System.out::println);
        List<Integer> integers = numbers3.stream().filter(n-> n%2==0).toList();
        System.out.println(integers);
        System.out.println("**********************END OF 3******************");

        //4. For a list of integers, return a list of the squares of each number.
        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = numbers4.stream().map(n -> n * n).toList();
        System.out.println(list);
        System.out.println("**********************END OF 4******************");

        //5. For a list of strings, return a list of the length of each string.
        List<String> names5 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> integerList = names5.stream().map(String::length).toList();
        System.out.println(integerList);
        System.out.println("**********************END OF 5******************");

        //6. For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
        List<String> names6 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names6.stream().filter(s->s.startsWith("T")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("**********************END OF 6******************");

        //7. For a list of strings, filter out the strings which do not start with the letter T, then uppercase the remaining strings and then sort them.
        List<String> names7 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> stringStream = new java.util.ArrayList<>(names7.stream().filter(s->s.startsWith("T")).map(String::toUpperCase).toList());
        Collections.sort(stringStream);
        System.out.println(stringStream);
        System.out.println("**********************END OF 7******************");

        //8. For a list of integers, find the sum of all the numbers.
        List<Integer> numbers8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // (((1+2)+3)+4) - pair by pair addition
        //Integer sum = numbers.stream().reduce(0, Integer::sum);
        Integer sum = numbers8.stream().reduce(0, (accumulator, currentElement)->accumulator + currentElement);
        System.out.println(sum);
        System.out.println("**********************END OF 8******************");

        //9. For a list of integers, find the sum of the squares of all the numbers.
        List<Integer> numbers9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer num = numbers9.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(num);
        System.out.println("**********************END OF 9******************");

        //10. For a list of integers, find the sum of the squares of all the even numbers.
        List<Integer> numbers10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sumOfSquaredEvenNo = numbers10.stream().filter(n->n%2==0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sumOfSquaredEvenNo);
        System.out.println("**********************END OF 10******************");

        //11. Given a list of numbers, find the maximum number in the list.
        List<Integer> numbers11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Optional<Integer> max = numbers11.stream().max(Integer::compare);
        //Optional<Integer> max = numbers11.stream().collect(Collectors.maxBy(Integer::compare));
        //max.ifPresent(System.out::println);
        Optional<Integer> max = numbers11.stream()
                .reduce((number1, number2) -> number1 > number2 ? number1 : number2);
        System.out.println("**********************END OF 11******************");

        //12. Given a list of numbers with duplicates, find the distinct numbers in the list.
        List<Integer> numbers12 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        numbers12.stream().distinct().forEach(System.out::println);
        System.out.println("**********************END OF 12******************");

        //13. Given a list of numbers, find the average of all the numbers.
        List<Integer> numbers13 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double avg = numbers13.stream().collect(Collectors.averagingInt(n -> n));
        //Integer average = numbers13.stream().reduce(0, (currentValue, currentElement) -> currentElement + currentValue) / numbers13.size();;
        System.out.println(avg);
        System.out.println("**********************END OF 13******************");

        //14. Given a list of strings, find the average length of all the strings.
        List<String> names14 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        //names14.stream().map(String::length).forEach(System.out::println);
        //Double avgLength = names14.stream().map(String::length).collect(Collectors.averagingInt(n -> n));
        names14.stream()
                .mapToInt(String::length)
                .average()
                .ifPresent(System.out::println);
        System.out.println("**********************END OF 14******************");

        //Given a list of strings, find the first string that is longer than 10 characters.
        List<String> names15 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names15.stream().filter(s -> s.length() > 10).findFirst().ifPresent(System.out::println);
        System.out.println("**********************END OF 15******************");

    }


}
