package Elementary_Sort;

public class InsertionSort {
    public static void main(String[] args) {
        Comparable a[]={3,4,1,2,6,8};
        insertionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    public static void exchange(Comparable a[],int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static void insertionSort(Comparable a[]){
        int N=a.length;
        for(int i=0;i<N;i++){
            for(int j=i;j>0;j--){
                if(less(a[j],a[j-1])){
                    exchange(a,j,j-1);
                }else break;
            }
        }
    }

}
