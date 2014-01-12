package com.github.pojobuildersample;

import java.util.List;

import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * <p>Company.</p>
 *
 * @author anavarro - Jan 12, 2014
 *
 */
@GeneratePojoBuilder
public class Company {

    private String name;
    private Adress adress;
    private List<Employee> employeeList;
    
    /**
     * Constructor.
     *
     */
    public Company() {
        // TODO Auto-generated constructor stub

    }

    /**
     * Returns the name.
     *
     * @return The name to return.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param aName The name to set.
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * Returns the adress.
     *
     * @return The adress to return.
     */
    public Adress getAdress() {
        return this.adress;
    }

    /**
     * Sets the adress.
     *
     * @param aAdress The adress to set.
     */
    public void setAdress(Adress aAdress) {
        this.adress = aAdress;
    }
    
    

    /**
     * Returns the employeeList.
     *
     * @return The employeeList to return.
     */
    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    /**
     * Sets the employeeList.
     *
     * @param aEmployeeList The employeeList to set.
     */
    public void setEmployeeList(List<Employee> aEmployeeList) {
        this.employeeList = aEmployeeList;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Company [name=" + this.name + ", adress=" + this.adress + "]";
    }
    
    
    
    

}
