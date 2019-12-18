/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mohamed
 */
public class game {

    public static String name(int x) {
        String n = "";
        switch (x) {
            case 1:
                n = "APEX";
                return n;

            case 2:
                n = "FORTNITE";
                return n;
            case 3:
                n = "NEED FOR SPEED";
                return n;
        }
        return n;
    }
}
