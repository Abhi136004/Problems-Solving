package Linked_List.Single;

public class MergeSort {
    public static Single.Node merge(Single.Node list){
        if(list == null || list.next == null){
            return list;
        }
        Single.Node mid  = middle(list);
        Single.Node midNext = mid.next;
        mid.next = null;

        Single.Node left = merge(list);
        Single.Node right = merge(midNext);

        return mergeList(left,right);
    }

    public static Single.Node mergeList(Single.Node head1, Single.Node head2){
        Single.Node f = head1;
        Single.Node s = head2;
        Single.Node dummy = new Single.Node();
        Single.Node temp = dummy;

        while(f != null && s != null){
            if(f.val <= s.val){
                temp.next = f;
                f = f.next;
            }
            else{
                temp.next = s;
                s = s.next;
            }
            temp = temp.next;
        }
        while(f != null){
            temp.next = f;
            f = f.next;
            temp = temp.next;
        }
        while(s != null){
            temp.next = s;
            s = s.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static Single.Node middle(Single.Node node){
        if (node == null || node.next == null) {
            return node;
        }
        Single.Node fast = node;
        Single.Node slow = node;
        Single.Node prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
                fast = fast.next.next;
                slow = slow.next;
        }

        return prev;
    }


}
