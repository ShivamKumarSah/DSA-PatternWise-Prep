class RemoveDuplicates{
    public static int solution(int[] arr){
        int i=0;
        int j=i+1;

        while (j<arr.length) {
            if (arr[j]!=arr[i]) {
                arr[++i]=arr[j];
            }
            j++;
        }

        return i+1;
    }

    public static void main(String args[]){
        int[] arr={7,9,12,12,13,13};
        int n=solution(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}