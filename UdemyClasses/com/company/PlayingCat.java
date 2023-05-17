package com.company;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            if (summer) {
                return temperature <= 45;
            } else {
                return temperature <= 35;
            }
        }
        return false;
    }
}
