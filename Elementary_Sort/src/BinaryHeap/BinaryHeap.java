package BinaryHeap;

public class BinaryHeap <Key extends Comparable<Key>> {

    private  Key[] pq;
    private static int n;
    public BinaryHeap(int capacity){
        pq=(Key[]) new Comparable[capacity+1];
    }
    public  boolean isEmpty(){
        return n==0;
    }

    public void insertKey(Key key){
        pq[++n]=key;
        swim(n);
    }
    public Key delMax(){
        Key max=pq[1];
        exchange(1,n--);
        sink(1);
        pq[n+1]=null;
        return max;
    }
    public  void swim(int k){
        while (k>1 && less(k/2,k)){
            exchange(k,k/2);
            k=k/2;
        }
    }
    public  void sink(int k){
        while(2*k<=n){
            int j=2*k;
            if(j<n && less(j,j+1)) j++;
            if(!less(k,j)) break;
            k=j;
        }
    }
    public  boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }
    private  void exchange(int i,int j){
        Key t=pq[i]; pq[i]=pq[j]; pq[j]=t;
    }
}
