package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=numberOfRows;i++){
            String k = getRow(i);
            sb.append(k+"\n");
        }

        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<=numberOfStars; i++){
            sb.append('*');
        }
        return sb.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(15);
    }
}
