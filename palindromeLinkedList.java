import java.util.LinkedList;

public class palindromeLinkedList {

    public static boolean palindrome(LinkedList<String> list){




        return true;
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("a");
        list.add("b");

        System.out.println(list);
        palindrome(list);
        
    }
    
}
