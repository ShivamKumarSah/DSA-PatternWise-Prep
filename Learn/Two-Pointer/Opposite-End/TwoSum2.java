public class TwoSum2 {
    public static boolean solution(int[] arr, int target) {
        int i=0, j=arr.length-1;

        while (i<j) {
            int sum=arr[i]+arr[j];
            if (sum==target) {
                return true;
            }else if (sum<target) {
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target=20;

        System.out.println(solution(arr, target));
    }
}

