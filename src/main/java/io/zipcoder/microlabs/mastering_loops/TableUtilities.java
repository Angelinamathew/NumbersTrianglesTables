package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; i++) {
                int result = i * j;
                str.append(String.format("%3d |", result));
            }
            str.append("\n");

        }
        return str.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int a = i * j;
                sb.append(String.format("%3d |", a));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j < tableSize; i++) {
                int b = i * j;
                sb.append(String.format("%3d |", b));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
