package Question2;

public class TypeA extends Student
{
    TypeA (int a, int b, int c)
    {
        super(a,b,c);
    }

    public int calculateFee ()
    {
        int fee = courseFee * numCourses;
        fee = fee / 2;
        return fee;
    }
}
