package com.example.unittestpracticejava;

import com.example.unittestpracticejava.model.Note;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoteTest {

    private static String timestamp1="timestamp1";
    private static String timestamp2="timestamp2";

    /*
    compare two equals notes
     */

    @Test
    void isNoteEqual_identicalProperties() throws Exception {
        //Arrange
        Note note1=new Note("note1","this is note #1",timestamp1);
        note1.setId(1);

        Note note2=new Note("note1","this is note #1",timestamp1);
        note2.setId(1);

        //Acts

        //Assert
        Assertions.assertEquals(note1,note2);
        System.out.println("note's ids is equals ");


    }
    /*
    compare two different ids
     */

    @Test
    void isNoteEqual_identicalId() throws Exception {
        //Arrange
        Note note1=new Note("note1","this is note #1",timestamp1);
        note1.setId(1);

        Note note2=new Note("note1","this is note #1",timestamp1);
        note2.setId(2);

        //Acts

        //Assert
        Assertions.assertNotEquals(note1,note2);
        System.out.println("note's ids isnot  equals ");


    }

    /*
    compare with two note with different timestamps
     */
    @Test
    void isNoteEqual_notIdenticalTimeStamps() throws Exception {
        //Arrange
        Note note1 = new Note("note1", "this is note #1", timestamp1);
        note1.setId(1);
        Note note2 = new Note("note1", "this is note #1", timestamp2);
        note2.setId(2);
        //Acts

        //Assert
        Assertions.assertNotEquals(note1, note2);
        System.out.println("note's TimeStamps isnot  equals ");
    }


     /*
    compare with two note with different titles
     */
     @Test
     void isNoteEqual_notIdenticalTitles() throws Exception {
         //Arrange
         Note note1 = new Note("note 1", "this is note #1", timestamp1);
         note1.setId(1);
         Note note2 = new Note("note 2", "this is note #1", timestamp1);
         note2.setId(1);
         //Acts

         //Assert
         Assertions.assertNotEquals(note1, note2);
         System.out.println("note's Titles is not  equals ");
     }

     /*
    compare with two note with different contents
     */

    @Test
    void isNoteEqual_notIdenticalContents() throws Exception {
        //Arrange
        Note note1 = new Note("note 1", "this is note #1", timestamp1);
        note1.setId(1);
        Note note2 = new Note("note 1", "this is note #2", timestamp1);
        note2.setId(1);
        //Acts

        //Assert
        Assertions.assertNotEquals(note1, note2);
        System.out.println("note's Contents is not  equals ");

    }




}
