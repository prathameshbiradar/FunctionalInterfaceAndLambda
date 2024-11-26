package lamda;
@FunctionalInterface
interface Infer
{
    public int m1(int a,int b);
}

public class Lambda4 {
    public static void main(String[] args) {
        Infer i =(a,b) -> a+b;
        System.out.println(i.m1(1,4));

    }
}
