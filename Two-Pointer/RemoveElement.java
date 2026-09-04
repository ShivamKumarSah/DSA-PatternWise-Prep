class RemoveElement{
    public static int solution(int[] arr, int val) {
        int i=0, j=0;
        while (j<arr.length) {
            if (arr[j]!=val) {
                arr[i++]=arr[j];
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr= {0, 1, 3, 0, 2, 2, 4, 2};
        int val=2;

        System.out.println(solution(arr, val));
    }
}