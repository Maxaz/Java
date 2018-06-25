import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Function<String, String> challenge2Function = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharacter(challenge2Function, "1234567890"));

        // challenge #6
        Supplier<String> iLoveJava = () -> "I love Java!";

        // challenge #7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        // challenge #8
        // the interface has to be functional interface. It should have only single method implemented, other methods must be implemented as default.

        // challenge #8.1
        // yes

        // challenge #8.2
        // yes

        // challenge #9

        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");

        topNames2015.stream()
                .map(s -> {
                    if (Character.isLowerCase(s.charAt(0))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        String cap = s.substring(0, 1).toUpperCase();
                        stringBuilder
                                .append(cap)
                                .append(s.substring(1));
                        return stringBuilder.toString();
                    }
                    return s;
                })
                .sorted()
                .forEach(System.out::println);

        // challenge #10

//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort(Comparable::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

        // challenge #11
        // look @ challenge #9


        //challenge #12

        System.out.println(topNames2015.stream()
                .filter(s -> s.startsWith("A"))
                .count());

        // challenge #13
        // the results will be similar but not sorted... :) or nothing because there is no terminal operation.

        // challenge #14

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }


    public static void challenge1() {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) System.out.println(part);
        };
        runnable.run();
    }

    public static void challenge2() {
        Function<String, String> challenge2Function = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
    }

    public static void challenge3() {
        Function<String, String> challenge2Function = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String challenge3Result = challenge2Function.apply("1234567890");
        System.out.println(challenge3Result);
    }

    public static String everySecondCharacter(Function<String, String> lambdaFunction, String src) {
        return lambdaFunction.apply(src);
    }
}
