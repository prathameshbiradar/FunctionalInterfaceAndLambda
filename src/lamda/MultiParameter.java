package lamda;
interface Test3
{
    void print(int a, int b);
}
public class MultiParameter {
    static void fun(Test3 t,int a,int b)
    {
        t.print(a,b);
    }

    public static void main(String[] args) {
        fun((a,b)-> System.out.println(a-b),10,7);
    }

}
