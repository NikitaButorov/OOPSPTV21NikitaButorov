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
        Authors author2 = new Authors();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilv");
        Authors author3 = new Authors();
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
        Book book2 = new Book();
        Book book3= new Book();
        Authors[] authors2 = new Authors[2];
        Authors[] authors3= new Authors[3];
        authors[1]=author2;
        authors2[2]=author3;
        book2.setAuthors(authors2);
        book2.setCaption("Zolotoy Telenok");
        System.out.println(book2.toString());
        book3.setAuthors(authors3);
        book3.setCaption("Zolotoy Telenok");
        System.out.println(book3.toString());
        
        
        
        
    }
    
}
