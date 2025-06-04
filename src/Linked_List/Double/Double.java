package Linked_List.Double;

public class Double {
    private Node head;
    private Node tail;
    private int size;

    public Double(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node element = get(size-1);
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }
    public Node get(int index){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        System.out.print("Start <==> ");
        while(temp != null){
            System.out.print(temp.val + " <==> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        System.out.print("END <==> ");
        while(last != null){
            System.out.print(last.val + " <==> ");
            last = last.prev;
        }
        System.out.println("START");


    }

}
