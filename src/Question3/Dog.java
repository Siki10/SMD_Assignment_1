package Question3;

public class Dog extends Animals implements DogTricks
{
    String name;
    boolean PetCheck;

    void breathe ()
    {
        System.out.println("This animal can do this thing");
    }

    void eatFood ()
    {
        System.out.println("This animal can do this thing");
    }

    boolean isPet ()
    {
        return true;
    }

    void walk ()
    {
        System.out.println("This animal can do this thing");
    }

    public void playDead()
    {
        System.out.println("This animal can do this thing");
    }
}

