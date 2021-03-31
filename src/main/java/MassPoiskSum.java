import java.util.HashSet;
import java.util.Set;

public class MassPoiskSum {

    public static void main(String[] args) {
        int[] mass = {3, 15,2, 6 ,7};
        System.out.println(twoSum(mass, 10)[1]);

    }

//    public static int[] twoSum(int[] nums, int targetSum){
//        int[] n = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == targetSum){
//                    n[0]=nums[i];
//                    n[1]=nums[j];
//                    return n;
//                }
//            }
//        }
//        return null;
//    }
//    public static int[] twoSum(int[] nums, int targetSum) {
//        int[] n = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int finalI = i;
//            if ( IntStream.of(nums).anyMatch(x -> (x + nums[finalI]) == targetSum)){
//                n[0] = nums[i];
//                n[1] = targetSum - nums[i];
//            }
//            return n;
//        }
//        return null;
//    }

    public static int[] twoSum(int[] nums, int targetSum) {

        int[] n = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.contains(targetSum -  nums[i])){
                n[0] =  targetSum -  nums[i];
                n[1] = nums[i];
                return n;
            }
        }
        return null;

    }


}
