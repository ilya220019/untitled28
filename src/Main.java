import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("A1");
        A.add("A22");
        A.add("A333");
        A.add("A4444");
        A.add("A55555");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("B1");
        B.add("B22");
        B.add("B333");
        B.add("B4444");
        B.add("B55555");
        ArrayList<String> C = new ArrayList<>();
        Iterator<String> a = A.iterator();
        Iterator<String> b = B.iterator();
        Collections.reverse(B);
        while (a.hasNext() && b.hasNext()){
            C.add(a.next());
            C.add(b.next());

        }
        System.out.println(C);

        C.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);
    }
}