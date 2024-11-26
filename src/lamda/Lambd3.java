package lamda;

interface Functional2
{
    void fun(int x);
    default  void print()
    {
        System.out.println("Hello");
    }
}
public class Lambd3  {

    public static void main(String[] args) {

        Functional2 fun1 = a -> System.out.println(a*2);

    fun1.fun(3);
    fun1.print();
    }
}
