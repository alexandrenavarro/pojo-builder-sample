package com.github.pojobuildersample;

import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * <p>Employee.</p>
 *
 * @author anavarro - Jan 12, 2014
 *
 */
@GeneratePojoBuilder
public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    
    /**
     * Constructor.
     *
     */
    public Employee() {
    }

    /**
     * Returns the firstName.
     *
     * @return The firstName to return.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the firstName.
     *
     * @param aFirstName The firstName to set.
     */
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    /**
     * Returns the lastName.
     *
     * @return The lastName to return.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the lastName.
     *
     * @param aLastName The lastName to set.
     */
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    /**
     * Returns the age.
     *
     * @return The age to return.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the age.
     *
     * @param aAge The age to set.
     */
    public void setAge(int aAge) {
        this.age = aAge;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [firstName=" + this.firstName + ", lastName=" + this.lastName + ", age=" + this.age + "]";
    }

    
}
