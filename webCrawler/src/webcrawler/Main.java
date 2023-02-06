/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webcrawler;

import java.util.ArrayList;

/**
 *
 * @author yunan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<WebCrawler> bots = new ArrayList<>();
        bots.add(new WebCrawler("https://abcnews.go.com/", 1));
        bots.add(new WebCrawler("https://www.npr.org/", 2));
        bots.add(new WebCrawler("https://www.nytimes.com/", 3));
        
        for(WebCrawler w : bots){
            try{
                w.getThread().join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
