/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author Nikita Butorov
 */
public class Book {
    private Authors[] authors;
    private String caption;
    
    public Book() {
    }

    public Authors[] getAuthors() {
        return authors;
    }

    public void setAuthors(Authors[] authors) {
        this.authors = authors;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Book{"
                + "authors=" + Arrays.toString(authors)
                + ", caption=" + caption 
                + '}';
    }
    
    
}
