package BinaryHeap;

public class APIBinaryHeap {


    public static void main(String[] args) {

        BinaryHeap<Integer> bh=new BinaryHeap(5);
        bh.insertKey(1);
        bh.insertKey(9);
        bh.insertKey(7);
        bh.insertKey(4);
        bh.insertKey(2);

        int deleted=bh.delMax();
        System.out.println(deleted);

    }
}
