/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class REPEAT {
 public static void main(String[] args) {
     
     System.out.println(repeatfunc("Case1: I want to to go to the the the zoo"));
     System.out.println("Real output: I want REPEAT go to REPEAT zoo");
     System.out.println("=============================");
     System.out.println(repeatfunc("Case2: I I want to to to go to the the the zoo"));
     System.out.println("Real output: REPEAT want REPEAT go to REPEAT zoo");
     System.out.println("=============================");
     System.out.println(repeatfunc("Case 3: I want Want to to to to go to the the the zOO zoo"));
     System.out.println("Read output: i REPEAT REPEAT go to REPEAT REPEAT");
     System.out.println("=============================");
     System.out.println(repeatfunc("Case 4: I want to to go to go go the the the zoo"));
     System.out.println("Read output: i want REPEAT go REPEAT REPEAT zoo");
     System.out.println("=============================");
     System.out.println(repeatfunc("Case 5: I I I I I want to to go to the the the zoo zoo zoo"));
     System.out.println("Read output: REPEAT want REPEAT go to REPEAT REPEAT");
     System.out.println("=============================");
     System.out.println(repeatfunc("Case 6: I want to to go to The The the zoo"));
     System.out.println("Read output: I want REPEAT go to REPEAT zoo");
     
     
           
 }
  public static String repeatfunc(String s) {
        String[] words = s.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

   
}

