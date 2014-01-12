package com.github.pojobuildersample;

/**
 * <p>MainJava.</p>
 * 
 * @author anavarro - Jan 12, 2014
 * 
 */
public class MainJava {

    /**
     * Constructor.
     * 
     */
    public MainJava() {
    }

    /**
     * <p>main.</p>
     * 
     * @param args
     */
    public static void main(String... args) {
        final Company company = (new CompanyBuilder()).withAdress(new AdressBuilder().withCity("City").withLine("line").build()).withName("name")
                .build();
        System.out.println("company=" + company);
    }
}
