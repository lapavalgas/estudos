
/**
 * Is a class java representation of UML diagram Student example in the files.
 * Just to exemplify the privates and public marker in both UML diagrams and Java Class.
 * Or to view in practice the encapsulation.
 */

public class Student_02_JavaClass {

    private float gpa;
    private String degreeProgram;

    public float getGPA(){
        return gpa;
    }

    public void setGPA(float newGPA){
        gpa = newGPA;
    }

    public String getDegreeProgram(){
        return degreeProgram;
    }

    public void setDegreeProgram(String newDegreeProgram){
        /**
         * This if example to show that the rules inside a class does not matter for the outside of class. The outside just need to know how send and retrieve data from it, nothing more.
         */
        if (gpa > 2.7){
            degreeProgram = newDegreeProgram;
        }
    }
}