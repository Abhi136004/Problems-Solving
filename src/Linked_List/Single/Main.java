package Linked_List.Single;

import static Linked_List.Single.MergeSort.merge;

public class Main {
    public static void main(String[] args) {

//        Single single = new Single();
//        single.insertFirst(10);
//        single.insertFirst(20);
//        single.insertFirst(30);
//        single.insertLast(40);
//        single.insertLast(50);
//        single.insertLast(50);
//
//        single.insertLast(50);
//        single.insertIndex(60,1);
//        single.insertRec(5,3);
//        single.display();
//        single.duplicates();
//        single.display();
//        System.out.println(single.deleteFirst());
//        single.display();
//        System.out.println(single.deleteLast());
//        single.display();
//        System.out.println(single.deleteIndex(2));
//        single.display();
//
//        System.out.println(single.Searching(10));


        //merging the sorted array;
//        Single list1 = new Single();
//        list1.insertLast(1);
//        list1.insertLast(1);
//        list1.insertLast(2);
//        list1.insertLast(5);
//        list1.display();
//
//        Single list2 = new Single();
//        list2.insertLast(1);
//        list2.insertLast(4);
//        list2.insertLast(7);
//        list2.insertLast(14);
//        list2.display();
//
//        Single ans = Single.merge(list1, list2);
//        ans.display();

        Single list3 = new Single();
        list3.insertLast(1);
        list3.insertLast(1);
        list3.insertLast(2);
        list3.insertLast(5);
        list3.insertLast(1);
        list3.insertLast(4);
        list3.insertLast(7);
        list3.insertLast(14);
        list3.display();

        Single.Node ans = merge(list3.head);
        list3.display();



//        ans.removeElements(ans,14);
//        ans.display();

    }
}
