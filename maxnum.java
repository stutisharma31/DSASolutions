// def find_max(arr):
//     max_num = arr[0]
//     for num in arr:
//         if num > max_num:
//             max_num = num
//     return max_num

// # Example usage
// arr = [3, 5, 1, 9, 2]
// print(find_max(arr))  # Output: 9
public class Main {
    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println("The maximum number is: " + findMax(arr));  // Output: 9
    }
}

