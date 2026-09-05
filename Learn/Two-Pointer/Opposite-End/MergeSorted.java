public class MergeSorted {
    public static int[] solution(int[] arr1, int[] arr2){
        int i=0, j=0, k=0;
        int m=arr1.length, n=arr2.length;
        int[] res=new int[m+n];

        while (i<m && j<n) {
            res[k++]=(arr1[i]<=arr2[j])?arr1[i++]:arr2[j++];
        }

        while (i<m) {
            res[k++]=arr1[i++];
        }
        while (j<n) {
            res[k++]=arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] res=solution(arr1, arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}