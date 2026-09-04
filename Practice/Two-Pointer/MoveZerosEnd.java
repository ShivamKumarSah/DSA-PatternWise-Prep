class MoveZerosEnd{
    public static int[] solution(int[] arr) {
        int i=0, j=0;
        while (j<arr.length) {
            if (arr[j]!=0) {
                arr[i++]=arr[j];
            }
            j++;
        }

        while (i<arr.length) {
            arr[i++]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 0, 4, 3, 0, 5, 0};
        int[] res=solution(arr);

        for (int i : res) {
            System.out.println(i);
        }
    }
}