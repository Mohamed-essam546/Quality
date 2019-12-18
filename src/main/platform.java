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
public class platform {

    public static String name(int x) {
        String n = "";
        switch (x) {
            case 1:
                n = "PS4";
                return n;

            case 2:
                n = "PC";
                return n;
            case 3:
                n = "XBOX";
                return n;
        }
        return n;
    }
}
