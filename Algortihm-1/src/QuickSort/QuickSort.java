package QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        Comparable a[]={4,6,3,1,9,12};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static boolean less(Comparable i,Comparable j){
        return i.compareTo(j)<0;
    }

    public static void exchange(Comparable a[],int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static int partition(Comparable a[],int lo,int hi){
        int i=lo,j=hi+1;
        while (true){
            while (less(a[++i],a[lo]))
                if(i==hi) break;
            while(less(a[lo],a[--j]))
                if(j==lo) break;

            if(i>=j) break;
            exchange(a,i,j);
        }
        exchange(a,lo,j);
        return j;
    }

    public static void sort(Comparable a[]){
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable a[],int lo,int hi){
        if(hi<=lo) return;
        int j=partition(a,lo,hi);
        System.out.println(j);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

}
