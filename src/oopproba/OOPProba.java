/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproba;

import myclasses.Authors;
import myclasses.Book;

/**
 *
 * @author Nikita Butorov
 */
public class OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Authors author1 = new Authors();
        author1.setFirstname("Aleksander");
        author1.setLastname("Puskin");
        Book book1=new Book();
        book1.setCaption("Jevgeny Onegin");
        Authors[] authors = new Authors[1];
        authors[0]=author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
        
    }
    
}
