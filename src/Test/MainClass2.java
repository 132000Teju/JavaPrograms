package Test;

public class MainClass2 {
    double overloadedMethod(double d)
{

    return d *= d;
}

    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }

    public static void main(String[] args)
    {
        MainClass main = new MainClass();

        System.out.println();
    }

}
