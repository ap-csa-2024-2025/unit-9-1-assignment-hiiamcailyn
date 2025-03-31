public class SpecialtyCoffee extends coffee
{
    //constuctor with 5 parameter
    private String flavor;

    public SpecialCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;

    }

    //default constructor 
    public SpecialityCoffee()
    {
        super("small", false, 1, "latte");
        flavor = "vanialla";
    }
    //constuctor with 3 parameters

    public SpecialityCoffee(String size, boolean String type, String flavor)

    {
        super("small", false, 1, "type");
        this.flavor = flavor;
    }

    public String toString()
    {
        return super.toString() + "with" + this.flavor;
    }
}