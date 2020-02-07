package Question2;

public abstract class Student
{
    int numCourses;
    int courseFee;
    int stuType;

    Student (int one, int two, int three)
    {
        numCourses = one;
        courseFee = two;
        stuType = three;
    }

    abstract int calculateFee ();
}
