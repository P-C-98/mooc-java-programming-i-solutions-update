/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
    
    public class Song {
    private String Song;
    private int length;
    
    public Song(String name, int length) {
        this.Song = name;
        this.length = length;
    }
    
    public String name() {
        return this.Song;
    }
    
    public int length() {
        return this.length;
    }
 
}

