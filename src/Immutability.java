import java.util.ArrayList;

public class Immutability {
    public static <T,U>void pr(T t, U u){
        System.out.println(t.toString() + u);
    }

    public static void main(String args[]){
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        pr("arrayA: ",arrayA);
        pr("arrayB: ",arrayB);

        arrayA.add(a);
        arrayB.add(b);
        pr("arrayA: ",arrayA);
        pr("arrayB: ",arrayB);

        a = new Integer (3);
        pr("arrayA: ",arrayA);
        pr("arrayB: ",arrayB);

        arrayA.add(arrayB.get(0));
        arrayB.add(arrayA.get(0));
        pr("arrayA: ",arrayA);
        pr("arrayB: ",arrayB);

        arrayA.set(0, new Integer (4));
        arrayB.set(0, new Integer (5));
        pr("arrayA: ",arrayA);
        pr("arrayB: ",arrayB);
    }
}
