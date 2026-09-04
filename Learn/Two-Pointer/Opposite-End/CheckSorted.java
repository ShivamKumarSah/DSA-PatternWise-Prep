public class CheckSorted {
    public static boolean solution(int[] arr){
        int i=0, j=i+1;

        while (j<arr.length) {
            if(arr[j]<arr[i]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 6, 5};
 
        System.out.println(solution(arr));
    }
}
