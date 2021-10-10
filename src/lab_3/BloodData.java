package lab_3;
/**
 Human blood type is an inherited trait based on whether or not
 proteins called antigensare on the surface of your red blood cells.
 Rhesus factor is an inherited protein found on the surface of red
 blood cells. Rh positive means your blood has the protein,
 Rh negative means that your blood lacks the protein.
 */

public class BloodData {
    private String bloodType;
    private String rhFactor;

    /**
     Default constructor, sets blood type to O+
     */
    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }
    /**
     Constructor support for user arguments
     */
    public BloodData(String bType, String rh)
    {
        bloodType = bType;
        rhFactor = rh;
    }
    /**
     Accessor for rhFactor
     */
    public String getRhFactor()
    {
        return rhFactor;
    }
    /**
     Accessor for bloodType
     */
    public String getBloodType()
    {
        return bloodType;
    }
    /**
     Mutator for rhFactor
     */
    public void setRhFactor(String rh)
    {
        rhFactor = rh;
    }
    /**
     Mutator for bloodType
     */
    public void setBloodType(String bType)
    {
        bloodType = bType;
    }
    /**
     System.out.print() support
     */
    public String toString()
    {
        return bloodType + rhFactor;
    }
}
