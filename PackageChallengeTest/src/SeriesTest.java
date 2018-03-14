import com.maxnazarski.Series;

public class SeriesTest {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("nSum method: " + Series.nSum(i));
            System.out.println("factorial method: " + Series.factorial(i));
            System.out.println("fibonacci method: " + Series.fibonacci(i));
            System.out.println("----------------------------------------");
        }
    }
}
