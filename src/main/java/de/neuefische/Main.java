package de.neuefische;

import de.neuefische.Model.BiologyStudent;
import de.neuefische.Model.ComputerScienceStudent;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent csStudent1 = new ComputerScienceStudent("C001","Klaus Strohmann", "Computer Science",true);
        BiologyStudent bioStudent1 = new BiologyStudent("B001", "Susann Bachlauf", "Biology", "Human");

        System.out.println(csStudent1.toString());
        System.out.println(bioStudent1.toString());


    }
}