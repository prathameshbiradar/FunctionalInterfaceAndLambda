package lamda;

import java.util.ArrayList;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        li.forEach( n -> System.out.println(n));
        li.forEach(n ->{
            if(n%2==0)
                System.out.println(n);
                });

    }
}
