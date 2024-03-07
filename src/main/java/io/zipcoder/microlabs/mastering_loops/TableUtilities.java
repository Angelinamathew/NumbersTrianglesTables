package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        for (int i=1; i<=5;i++) {
            for (int j=0; j<=5; i++){
                int result = i*j;
                str.append(String.format("%3d |", result));
            }
            str.append("\n");

        }
        return str.toString();
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
