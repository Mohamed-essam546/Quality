/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quality;

import main.game;
import main.platform;
import main.version;

/**
 *
 * @author Mohamed
 */
public class Quality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(game.name(1));
        System.out.println(platform.name(2));
        System.out.println(version.name(3));
        
        System.out.println(game.name(3));
        System.out.println(platform.name(1));
        System.out.println(version.name(2));
        
        System.out.println(game.name(2));
        System.out.println(platform.name(3));
        System.out.println(version.name(1));
    }

}
