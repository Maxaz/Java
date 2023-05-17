package com.company;

public class SecondsMinutesChallenge {

    public static void main(String[] args) {
        getDurationString(65,45);
        getDurationString(3945L);
    }

    private static String getDurationString(long minutes, long seconds) {
        String output;
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            long calculatedHours = minutes / 60;
            long calculatedMinutes = minutes % 60;
            output = calculatedHours + "h " + calculatedMinutes + "m " + seconds + "s ";
        } else {
            output = "Invalid value";
        }
        System.out.println(output);
        return output;
    }

    public static String getDurationString(long seconds) {
        String output;
        if (seconds >= 0){
            long calculatedMinutes = seconds / 60;
            long calculatedSeconds = seconds % 60;
            return getDurationString(calculatedMinutes,calculatedSeconds);
        }
        output = "Invalid value";
        return output;
    }
}
