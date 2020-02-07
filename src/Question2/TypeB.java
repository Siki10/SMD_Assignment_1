package Question2;

public class TypeB extends Student
{
    TypeB (int a, int b, int c)
    {
        super(a,b,c);
    }

    public int calculateFee ()
    {
        int fee = courseFee * numCourses;
        return fee;
    }
}
