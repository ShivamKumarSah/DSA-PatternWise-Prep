public class Intersection {
    public static int[] solution(int[] arr1, int[] arr2) {
        int i=0, j=0, k=0;
        int m=arr1.length, n=arr1.length;
        int[] res=new int[(m<n)?m:n];

        while (i<m && j<n) {
            if (arr1[i]==arr2[j]) {
                res[k++]=arr1[i++];
                j++;
            }
            else if (arr1[i]<arr2[j]) {
                i++;
            }else{
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6};

        int[] res=solution(arr1, arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
