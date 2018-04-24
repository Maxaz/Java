import java.util.Scanner;

public class X {
   private int x;

    public X() {
        this.x = new Scanner(System.in).nextInt();
    }

    public void x(){
        for (int x = 1; x < 13; x++) {
            System.out.println(x*this.x);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter an int: ");
        X x = new X();
        x.x();

    }
}
