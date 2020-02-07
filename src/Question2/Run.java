package Question2;

public class Run
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 20000;

        Student Aone = new TypeA(a,b,1);
        Student Bone = new TypeB(a,b,2);
        Student Cone = new TypeC(a,b,3);

        int fee = Aone.calculateFee();
        System.out.println(fee);
        fee = Bone.calculateFee();
        System.out.println(fee);
        fee = Cone.calculateFee();
        System.out.println(fee);
    }
}
