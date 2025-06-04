package Linked_List.Single;

public class Single {
     Node head;
    private Node tail;
    private int size;

    public Single(){
        this.size = 0;
    }
    public static class Node{
        int val ;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        public Node() {

        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }
    public void insertIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size+=1;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node value = get(size-2);
        int element = tail.val;
        tail = value;
        tail.next = null;
        size--;
        return element;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int deleteIndex(int index){
        if(index <= 1){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node value = get(index-1);
        int element = value.next.val;
        value.next= value.next.next;
        return element;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");

    }
    //Searching an element in a LinkedList
    public int Searching(int value){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.val == value){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    //inserting an element using recursion
    public void insertRec(int val, int index){
        head = insertRecursion(3,5,head);
    }

    private  Node insertRecursion(int index, int val, Node node){
        if(index == 0){
            Node n = new Node(val,node);
            size++;
            return n;
        }

        node.next = insertRecursion(index-=1, val,node.next);
        return node;
    }

    //Dupilcates in the linkedlist
    public void duplicates(){
        Node temp = head;

        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    //Merge the sorted lists

    public static Single merge(Single list1, Single list2){
        Single ans = new Single();
        Node f = list1.head;
        Node s = list2.head;

        while(f != null && s != null){
            if(f.val < s.val){
               ans.insertLast(f.val);
               f = f.next;

            }
            else{
                ans.insertLast(s.val);
                s= s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    public Node removeElements(Single list, int val) {
        Node temp = list.head;
        while(temp.next != null){
            if(temp.next.val == val){
                    temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;

    }






}
