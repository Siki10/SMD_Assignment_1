package Question1;

import java.util.ArrayList;

public class SoftwareDeveloper extends Employee
{
    ArrayList<String> SDBen = new ArrayList<String>();
    SoftwareDeveloper ()
    {
        super();
        String xd = Benefits.get(0);
        SDBen.add(xd);
        SDBen.add("Health Benefits");
    }

    int calculatePay ()
    {
        int a = SDBen.size();
        if (a == 2)
            return 2000;
        return 1000;
    }
}
