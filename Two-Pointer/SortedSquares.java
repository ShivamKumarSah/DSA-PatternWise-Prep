import java.util.ArrayList;

class SortedSquares {
    public static int[] solution1(int[] main) {
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        int l=0;
        while(l<main.length){
            if (main[l]<0) {
                arr1.add(main[l]*main[l]);
            }else{
                arr2.add(main[l]*main[l]);
            }

            l++;
        }
        arr1.sort(null);

        int i=0, j=0, k=0;

        while (i<arr1.size() && j<arr2.size()) {
            main[k++]=(arr1.get(i)<=arr2.get(j)) ? arr1.get(i++):arr2.get(j++);
        }

        while (i<arr1.size()) {
            main[k++]=arr1.get(i++);
        }
        while (j<arr2.size()) {
            main[k++]=arr2.get(j++);
        }

        return main;
    }

    public static int[] solution(int[] main){
        int l=0, r=main.length-1, k=main.length-1;
        int[] arr=new int[main.length];

        while (l<r) {
            int ls=main[l]*main[l], rs=main[r]*main[r];
            if(ls>rs){
                arr[k--]=ls;
                l++;
            }
            else{
                arr[k--]=rs;
                r--;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] main={-4,-1,0,3,10,12};

        int[] res=solution(main);

        for (int i : res) {
            System.err.println(i);
        }
    }
}