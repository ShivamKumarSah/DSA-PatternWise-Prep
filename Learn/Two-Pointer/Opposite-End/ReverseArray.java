public class ReverseArray {
    public static int[] solution(int[] arr){
        int i=0, j=arr.length-1;

        while (i<j) {
            int temp=arr[j];
            arr[j--]=arr[i];
            arr[i++]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int[] res=solution(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
