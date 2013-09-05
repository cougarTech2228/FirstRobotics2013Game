/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author espaker16
 */
public class plan {
    
    int str1;//1=attack 2=defend 3=both
    int str2;//priority
    int str3;//climber
    int str4;//shooter
    int str5;//autonomous
    int str6;//pickup
    
    void setStr1(String choice){
        if(choice.matches("attack")){
            str1=1;
        }
        if(choice.matches("defence")){
            str1=2;
        }
        if(choice.matches("both")){
            str1=3;
        }
    }
    void setStr2(String choice){
        
    }
    void setStr3(String choice){
        
    }
    void setStr4(String choice){
        
    }
    void setStr5(String choice){
        
    }
    void setStr6(String choice){
        
    }
    
}
