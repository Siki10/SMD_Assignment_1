package Question1;

import java.util.ArrayList;

public class Manager extends Employee
{
    ArrayList<String> MBen = new ArrayList<String>();
    Manager ()
    {
        super();
        String xd = Benefits.get(0);
        MBen.add(xd);
        MBen.add("Health Benefits");
        MBen.add("Car Parking");
    }

    int calculatePay ()
    {
        int a = MBen.size();
        if (a == 3)
            return 3000;
        else if (a == 2)
            return 2000;
        return 1000;
    }
}
