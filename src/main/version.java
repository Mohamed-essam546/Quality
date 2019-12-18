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
public class version {

    public static String name(int x) {
        String n = "";
        switch (x) {
            case 1:
                n = "2019";
                return n;

            case 2:
                n = "2018";
                return n;
            case 3:
                n = "2017";
                return n;
        }
        return n;
    }
}
