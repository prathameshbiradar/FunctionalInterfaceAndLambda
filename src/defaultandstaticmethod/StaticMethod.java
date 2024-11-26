package defaultandstaticmethod;
interface inter
{
    public static void m1()
    {
        System.out.println("Static method of interface");
    }
}
public class StaticMethod implements inter {
    public static void main(String[] args) {
        inter.m1();

    }
}
