package lecture4;

public class Statistics {
    public static int minValue(int[] massive) {
        int min = massive[0];
        for (int j : massive) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    public static int maxValue(int[] massive) {
        int max = massive[0];
        for (int j : massive) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int average(int[] massive) {
        int sum = 0;
        for (int j : massive) {
            sum += j;
        }
        return sum / massive.length;
    }

