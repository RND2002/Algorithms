package StackQueue;


public class Stack <Item>{
    private Node first=null;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public  void push (Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        System.out.println(item+" has been pushed onto Stack");
    }
    public void pop(){
        Item item=first.item;
        first=first.next;
        System.out.println(item +" has been popped from Stack");
    }
}

