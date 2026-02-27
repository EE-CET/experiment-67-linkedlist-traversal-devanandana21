import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        ListIterator<Integer> iterator = list.listIterator();
        
        LinkedList<Integer> forward = new LinkedList<>();
        while (iterator.hasNext()) {
            forward.add(iterator.next());
        }
        
        LinkedList<Integer> backward = new LinkedList<>();
        while (iterator.hasPrevious()) {
            backward.add(iterator.previous());
        }
        
        System.out.println("Forward: " + forward);
        System.out.println("Backward: " + backward);
        
        scanner.close();
    }
}
