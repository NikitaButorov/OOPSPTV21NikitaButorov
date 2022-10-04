package myclasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita Butorov
 */
public class Authors {
    private String firstname;
    private String lastname;

    public Authors() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Authors{"
                + "firstname=" + firstname
                + ", lastname=" + lastname 
                + '}';
    }
    
    
    
}
