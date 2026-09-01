class Removeduplicates{
    public static void main(String args[]){
        int i=0;
        int j=i+1;

        int[] arr={1,1,2,2,3,3,3};

        while (j<arr.length) {
            if (arr[j]!=arr[i]) {
                arr[++i]=arr[j];
            }
            j++;
        }

        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k]);
        }
    }
}