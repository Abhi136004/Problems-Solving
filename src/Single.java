

public class Single {
    private Node head;
    private Node tail;
    int size;

    public Single(){

        this.size = 0;
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
            tail.next = null;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
        size += 1;
    }

    public void insertIndex(int val, int index){
       if(index == 0){
           insertFirst(val);
           return;
       }
       if(index == size-1){
           insertLast(val);
           return;
       }
       Node prev = get(index-1);
       Node node = new Node(val,prev.next);
       prev.next = node;
       size += 1;
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
    }

    public void deleteLast(){
        if(head.next == null){
            deleteFirst();
            return;
        }
        Node prev = get(size-2);
        tail = prev;
        prev.next = null;
        size -=1;
    }

    public void deleteIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        if(index == size-1){
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size -= 1;
    }

    public int searching(int val){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.val == val){
                return index;
            }
            temp = temp.next;
            index += 1;
        }
        return -1;
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
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
