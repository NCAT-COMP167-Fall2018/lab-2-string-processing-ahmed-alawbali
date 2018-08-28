/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmedalawbali
 */
public class StringProcessing {
    static String[] records;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        records = new String[100];
        try {
            java.io.File inputFile = new java.io.File(args[0]);
            Scanner processing = new Scanner(inputFile);
            
            int currentIndex = 0;
            while(processing.hasNext()){
                String [] line = processing.nextLine().split(",");
                String firstName = line[0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                records[currentIndex] = String.format("");
                currentIndex++;
                
                String output = String.format("%-20s%-20s%-10s%10d", "William", "Bryant", "Male", 22 );
                String output2 = String.format("%-20s%-20s%-10s%10s%10s%20s%20s", firstName, lastName, gender, age, phoneNumber," ", email ); 
                //System.out.println(output);
                System.out.println(output2);
                
                
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Unable to read input file");
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
