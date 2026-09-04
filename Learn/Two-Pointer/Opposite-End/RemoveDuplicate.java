public class RemoveDuplicate {
    public static int[] solution(int[] arr){
        int i=0, j=i+1;

        while (j<arr.length) {
            if (arr[i]!=arr[j]) {
                arr[++i]=arr[j];
            }
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3};
        int[] res=solution(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}