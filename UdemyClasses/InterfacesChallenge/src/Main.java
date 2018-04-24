import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ISaveable song1 = new Song("Max", "song one", 2, 62);
        ISaveable video1 = new Video("Max", "video one", 1, 15);
        List<String> savedsong1 = song1.save();
        List<String> savedvideo = video1.save();


        saveToDeposit(song1);
        loadFromDeposit(song1);
        System.out.println(song1);




















    }

    public static void saveToDeposit (ISaveable itemToSave){
        if (itemToSave != null){
            for (int i = 0; i < itemToSave.save().size(); i++) {
                System.out.println(itemToSave.save().get(i) + " was saved in deposit");
            }
        }
    }

    public static void loadFromDeposit (ISaveable itemToLoad){
        ArrayList<String> values = readValues();
        itemToLoad.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
