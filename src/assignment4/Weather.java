/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author rizwaan and Graysen
 */
public class Weather {
    private int temp;
    private String skyCond;
    
    public Weather() {
        temp = 70;
        skyCond = "sunny";
    }
    
    public Weather(int setTemperature, String setSkyCond){
        temp = setTemperature;
        skyCond = setSkyCond;
    }
    
    public int getTemp(){
        return temp;
    }
    
    public String getSkyCond(){
        return skyCond;
    }
    
   public int getTempCel(){
       return ((temp - 32)*(5/9)); 
   }
}
