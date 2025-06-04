public class Double {
    private Node head;
    int size;
    public Double() {
        this.size = 0;
    }
    private class Node{

         int val;
        Node next;
         Node prev;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val,Node next,Node prev) {
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
        size += 1;

    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node previous = get(size-1);
        previous.next = node;
        node.prev = previous;
        node.next = null;
        size += 1;
    }

    public void insertIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }
        Node previous = get(index-1);
        Node node = new Node(val,previous.next,previous.prev);
        node.next = previous.next;
        node.prev = previous;
        previous.next.prev = node;
        previous.next = node;


    }
    public Node get(int index){
        Node temp = head;
        while(index > 0){
            temp = temp.next;
            index -= 1;
        }
        return temp;
    }
    public void display(){
       Node temp = head;
       System.out.print("Null <==> ");
       while(temp != null){
           System.out.print(temp.val + " <==> ");
           temp = temp.next;
       }
       System.out.print("Null");
    }


}
