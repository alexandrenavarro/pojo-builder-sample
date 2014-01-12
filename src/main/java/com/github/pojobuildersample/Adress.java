package com.github.pojobuildersample;

import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * <p>Adress.</p>
 *
 * @author anavarro - Jan 12, 2014
 *
 */
@GeneratePojoBuilder
public class Adress {

    private String line;
    private int zip;
    private String city;
    
    
    /**
     * Constructor.
     *
     */
    public Adress() {
    }


    /**
     * Returns the line.
     *
     * @return The line to return.
     */
    public String getLine() {
        return this.line;
    }


    /**
     * Sets the line.
     *
     * @param aLine The line to set.
     */
    public void setLine(String aLine) {
        this.line = aLine;
    }


    /**
     * Returns the zip.
     *
     * @return The zip to return.
     */
    public int getZip() {
        return this.zip;
    }


    /**
     * Sets the zip.
     *
     * @param aZip The zip to set.
     */
    public void setZip(int aZip) {
        this.zip = aZip;
    }


    /**
     * Returns the city.
     *
     * @return The city to return.
     */
    public String getCity() {
        return this.city;
    }


    /**
     * Sets the city.
     *
     * @param aCity The city to set.
     */
    public void setCity(String aCity) {
        this.city = aCity;
    }


    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Adress [line=" + this.line + ", zip=" + this.zip + ", city=" + this.city + "]";
    }




}
