import java.util.*;
public class iso_mor{
        // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {

         LinkedHashMap<Character,Integer>hm1 = new LinkedHashMap<>();
         LinkedHashMap<Character,Integer>hm2 = new LinkedHashMap<>();
         if(hm1.size()!=hm2.size()){
             return false;
         }
        for(int i=0;i<s1.length();i++){
            if(hm1.containsKey(s1.charAt(i))){
                hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
            }
            else{
                hm1.put(s1.charAt(i),1);
            }
        }
         for(int i=0;i<s2.length();i++){
            if(hm2.containsKey(s2.charAt(i))){
                hm2.put(s2.charAt(i),hm2.get(s2.charAt(i))+1);
            }
            else{
                hm2.put(s2.charAt(i),1);
            }
        }
        
            for(int i=0;i<s1.length();i++){
            if(hm1.get(s1.charAt(i))!=hm2.get(s2.charAt(i))){
                return false;
            }
            }
        return true;
        
    }
    public static void main(String[] args) {
       String s1 = "aab"; String s2 = "xxy";
        System.out.println(areIsomorphic(s1, s2));
    }
}