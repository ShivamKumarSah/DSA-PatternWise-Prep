class TwoSum{
    public static int[] solution(int[] arr, int target){
        int i=0,j=arr.length-1;

        while (i<j) {
            int sum=arr[i]+arr[j];
            if (sum==target) {
                return new int[] {arr[i],arr[j]};
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] pair=solution(arr, 9);

        for (int i : pair) {
            System.out.println(i);
        }
    }
}