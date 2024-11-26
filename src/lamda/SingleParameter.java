package lamda;

import org.w3c.dom.ls.LSOutput;

interface Test2
{
    void print(int a);
}
public class SingleParameter {
    static void fun(Test2 t, int a)
    {
        t.print(a);
    }
    public static void main(String[] args) {

        fun((a)-> System.out.println(a*2),10);

    }
}
