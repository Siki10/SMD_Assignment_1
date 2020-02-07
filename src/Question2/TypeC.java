package Question2;

public class TypeC extends Student
{
    TypeC (int a, int b, int c)
    {
        super(a,b,c);
    }

    public int calculateFee ()
    {
        int fee = courseFee * numCourses;
        fee = fee - (fee/4);
        return fee;
    }
}
