/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.music.system;

/**
 *
 * @author rishi
 */
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.ArrayList;
        

public class AlbumCollection { 
    public static void main(String[] args) { 
        //System.out.println("Hello world!"); 
        
        try { 
            ArrayList<Album> albums = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("albums.txt")); 
            String text; 
            int counter = 0; 
            int hours; 
            int minutes; 
            int seconds; 
            int codePoint; 
            boolean foundColon;
            StringBuilder sb = new StringBuilder();
            String author = "";
            String str = "";
            String title = "";
            boolean isNewSong = false;
            boolean atStart = true;
            int year;
            do { 
                text = reader.readLine(); 
                System.out.println(text); 
                counter = 0;
                char c = ':';
                for (int j = 0; j < text.length(); j++) {
                    codePoint = text.codePointAt(j); 
                    System.out.println(codePoint); 
                    if (codePoint == 58) {
                        counter++;
                    }
                }
                foundColon = false;
                foundBracket = false;
                for (int i = 0; i < text.length(); i++) { 
                    System.out.println(text.charAt(i)); 
                    codePoint = text.codePointAt(i); 
                    System.out.println(codePoint); 
                    if (codePoint == 58) {
                        foundColon = true;
                    }
                    if (counter == 2) {
                        if (i == 0) {
                           str += text.charAt(i);
                           hours = Integer.parseInt(str.toString());
                           str = "";
                        } else if (i == 2 || i == 3) {
                            str += text.charAt(i);
                            if (i == 3) {
                                minutes = Integer.parseInt(str);
                                str = "";
                            }
                        } else if (i == 5 || i == 6) {
                            str += text.charAt(i);
                            if (i == 6) {
                                seconds = Integer.parseInt(str);
                                str = "";
                            }
                        }
                    } else if (counter == 1) {
                       isNewSong = true;
                       author += text.charAt(i);
                       if(foundColon) {
                           title += text.charAt(i);
                       }
                       if (foundBracket && !(text.charAt(i).equals(")")))
                       {
                        year += text.charAt(i);
                       }
                    }
                } 
                if(isNewSong && !(atStart)) {
                    year = Integer.parseInt(year);
                    albums.add(Album(title, author, year, hours, minutes, seconds));
                    title = "";
                    author = "";
                    hours = 0;
                    minutes = 0;
                    seconds = 0;
                }
                atStart = false;
            } while (text != null);
            System.out.println(albums);
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 
