package Interface.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster("gowno",50,0);
        List list = new ArrayList<String>();
        list = monster.write();
        for (Object str : list){
            System.out.println(str);
        }
        System.out.println("************");
        System.out.println(monster.toString());
    }
}
