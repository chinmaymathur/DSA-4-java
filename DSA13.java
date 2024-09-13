// two sum problem
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DSA13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        System.out.println()
        Map<Integer, Integer> map = new HashMap<>();
  
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            
          
            if (map.containsKey(complement)) {
  
                System.out.println("Indexes: " + map.get(complement) + ", " + i);
            }

            map.put(nums[i], i);
        }
        
        scanner.close();
    }
}

