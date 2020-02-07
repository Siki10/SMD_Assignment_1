package Question1;

import java.util.ArrayList;

public abstract class Employee
{
    public ArrayList<String> Benefits = new ArrayList<String>();

    Employee ()
    {
        Benefits.add("Standard");
    }

    abstract int calculatePay ();
}
