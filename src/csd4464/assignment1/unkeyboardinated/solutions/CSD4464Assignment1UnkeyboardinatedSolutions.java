/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.unkeyboardinated.solutions;

/**
 *
 * @author c0660455
 */
public class CSD4464Assignment1UnkeyboardinatedSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String stringPower(String s, int i) {
        String str = s;
        int in = i;
        if (s.equals("")) {
            return "";
        } else if(i < 1) {
             return null;
        }
        else if( in == 1) {
            return s;
        }
        else if (in == 2) {
            str += str;
            return str;
        }
        
        else{
            return"Not Correct.";
        }
    }

}
