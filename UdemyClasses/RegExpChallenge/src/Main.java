import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // challenge #1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //challenge #2
        System.out.println("*** challenge 2 ***");
        String challenge2 = "I want a ball.";
        String challenge2PatString = "I want a .*";
        System.out.println("challenge 1 : " + challenge1.matches(challenge2PatString));
        System.out.println("challenge 2 : " + challenge2.matches(challenge2PatString));

        //challenge #3
        System.out.println("*** challenge 3 ***");
        String challenge3PatString = "I want a \\w+";
        Pattern challenge2Pat = Pattern.compile(challenge2PatString);
        Matcher challenge2Mat = challenge2Pat.matcher(challenge2);
        Matcher challenge1Mat = challenge2Pat.matcher(challenge1);

        System.out.println("challenge1 matches: " + challenge1Mat.matches());
        System.out.println("challenge2 matches: " + challenge2Mat.matches());

        //challenge #4
        System.out.println("*** challenge 4 ***");
        String challenge4 = "Replace all blanks with underscore.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        //challenge #5
        System.out.println("*** challenge 5 ***");
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("a*bc*d*ef*g"));
        System.out.println(challenge5.matches("[a-g]+"));

        //challenge #6
        System.out.println("*** challenge 6 ***");
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.matches("^a*bc*d*ef*g$"));

        //challenge #7
        System.out.println("*** challenge 7 ***");
        String challenge7 = "abcd.135";
        String challenge71 = "kjisl.22";
        String challenge72 = "f5.12a";
        String challenge7Pat = "^\\D+\\.\\d+$";
        System.out.println(challenge7.matches(challenge7Pat));
        System.out.println(challenge71.matches(challenge7Pat));
        System.out.println(challenge72.matches(challenge7Pat));

        //challenge #8
        System.out.println("*** challenge 8 ***");
        String ch8 = "abcd.135uvqz.7tzik.999";
        String challenge8Pat = "(\\D+\\.)(\\d+)";
        Pattern ch8Pat = Pattern.compile(challenge8Pat);
        Matcher ch8Mat = ch8Pat.matcher(ch8);
        while (ch8Mat.find()) {
            System.out.println(ch8Mat.group(2));
        }

        //challenge #9
        System.out.println("*** challenge 9 ***");
        String ch9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String challenge9Pat = "\\D+\\.(\\d+)\\s";
        Pattern ch9Pat = Pattern.compile(challenge9Pat);
        Matcher ch9Mat = ch9Pat.matcher(ch9);
        while (ch9Mat.find()) {
            System.out.println(ch9Mat.group(1));
        }

        //challenge #10
        System.out.println("*** challenge 10 ***");
        ch9Mat.reset();
        while (ch9Mat.find()) {
            System.out.println(ch9Mat.start(1) + " " + (ch9Mat.end(1) - 1));
        }

        //challenge #11
        System.out.println("*** challenge 11 ***");
        String ch10 = "{0,2}, {0,5}, {1,3}, {2,4}";
        Pattern ch10Pat = Pattern.compile("\\{(.+?)\\}");
        Matcher ch10Mat = ch10Pat.matcher(ch10);
        while(ch10Mat.find()){
            System.out.println(ch10Mat.group(1));
        }

        //challenge #12 & #13 & #14
        System.out.println("*** challenge 11 ***");
        String ch11 = "11111";
        System.out.println(ch11.matches("^\\d{5}(?:[-\\s]\\d{4})?$"));

    }

}
