package lab_3;

/**
 * The Patient class simulates a health care database with attributes that
 * include storage for a identification number, an age and a BloodData type.
 * This type of class is refered to as a "has a" or composition relationship.
 */


public class Patient {
    /**
     * step A
     * Data attributes for the Patient class which has a BloodData object
     */
    private String ID;
    private int Age;
    private BloodData BData;


    /**
     * step B
     * Default constructor that sets the ID and Age to 0 and the blood type to 0
     */
    public Patient() {
        ID = "0000";
        Age = 0;
        BData = new BloodData();
    }


    /**
     * step C
     * Parameterized constructor that supports the user choosing initial values
     * for each of the data attributes
     */

    public Patient(String iD, int age, String bType, String rhFact) {
        ID = iD;
        Age = age;
        BData = new BloodData(bType, rhFact);
    }


    /**
     * step D
     * Accessor for the patient identifier
     */
    public String getID() {
        return ID;
    }


    /**
     * step E
     * Mutator for the patient identifier
     */
    public void setID(String iD) {
        this.ID = iD;
    }


    /**
     * step F
     * Accessor for the patient age
     */
    public int getAge() {
        return Age;
    }

    /**
     * step G
     * Mutator for the patient age
     */
    public void setAge(int age) {
        this.Age = age;
    }

    /**
     * step H
     * Accessor for the patient blood type
     */
    public BloodData getBD() {
        return BData;
    }


    /**
     * step I
     * Mutator for the patient blood type
     */
    public void setBD(BloodData bd) {
        this.BData = bd;
    }

    /**
     * step J
     * Formated String representation of a Patient's attributes
     */
    public String toString() {
        return String.format("Patient #%4s%nAge %4d%nBlood type %3s",
                ID, Age, BData);
    }
}