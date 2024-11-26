package lamda;

 interface Functional
{
 int operation(int a, int b);
}
public class Lamda2 {
    public static void main(String[] args) {
        Functional add = (a,b) -> a+b ;
        Functional multiply = (a,b) -> a*b;

        System.out.println( add.operation(3,3));
        System.out.println(multiply.operation(4,5));
    }
}
