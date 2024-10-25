import java.util.HashSet;
import java.util.Set;

class UniqueSum {

    public static int uniqueSum(int a, int b, int c) {
        Set<Integer> uniqueValues = new HashSet<>();

        // Add values to the set
        uniqueValues.add(a);
        uniqueValues.add(b);
        uniqueValues.add(c);

        // Sum the values in the set
        int sum = 0;
        for (int value : uniqueValues) {
            // Count only if it appears once
            if (countOccurrences(a, b, c, value) == 1) {
                sum += value;
            }
        }

        return sum;
    }

    private static int countOccurrences(int a, int b, int c, int value) {
        int count = 0;
        if (a == value) count++;
        if (b == value) count++;
        if (c == value) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(uniqueSum(1, 2, 3)); 
        System.out.println(uniqueSum(3, 3, 3));
        System.out.println(uniqueSum(1, 1, 2));
    }
}
