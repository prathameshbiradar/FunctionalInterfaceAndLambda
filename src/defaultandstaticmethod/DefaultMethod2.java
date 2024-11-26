package defaultandstaticmethod;
interface Left
{
    default void m1()
    {
        System.out.println("Left interface method");
    }
}
interface Right
{
    default void m1()
    {
        System.out.println("Right interface method");
    }
}
public class DefaultMethod2 implements Left,Right{
    public void m1()
    {
        //System.out.println("Default class method");
        //Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        DefaultMethod2 d = new DefaultMethod2();
        d.m1();

    }
}
