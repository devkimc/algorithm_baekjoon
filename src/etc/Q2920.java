package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String answer = "mixed";

        if(nums[0] == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i+1] - nums[i] != 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
            return;
        }

        if(nums[0] == 8) {
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i] - nums[i+1] != 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
            return;
        }

        System.out.println("answer = " + answer);
    }
}
