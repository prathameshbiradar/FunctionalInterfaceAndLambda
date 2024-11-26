package defaultandstaticmethod;
interface I1
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("Default Method");
    }
}
class Test1 implements I1{
    @Override
    public void m1() {
        System.out.println("M1 of Test1");
    }

    @Override
    public void m2() {
        System.out.println("M2 of Test1");
    }
}
class Test2 implements I1{
    @Override
    public void m1() {
        System.out.println("M1 of Test2");
    }

    @Override
    public void m2() {
        System.out.println("M2 of Test2");
    }
}
public class DefaultMethod {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        t1.m1();
        t2.m1();
        t1.m2();
        t2.m2();
        t1.m3();
        t2.m3();
    }
}
