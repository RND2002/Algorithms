package Elementary_Sort;
import java.lang.Comparable;
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Hello");
        Comparable a[]={3,4,1,2,6,8};
        selectionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exchange(Comparable a[],int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static void selectionSort(Comparable a[]){
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])){
                    min=j;
                }

            }
            exchange(a,i,min);
        }
    }
}
