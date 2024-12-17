import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        List<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of Arrays: " + intersection);
    }
}

