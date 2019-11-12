package Studios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args){
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        String[] stringArr = testString.toLowerCase().split("");
        HashMap<String, Integer> letterCount = new HashMap<String, Integer>();


        for (String letter : stringArr){

            if (letterCount.containsKey(letter)){
                letterCount.put(letter, letterCount.get(letter) + 1);
            } else {
                letterCount.put(letter, 1);
            }

        }

        for (Map.Entry<String, Integer> letter : letterCount.entrySet()){
            System.out.print(letter.getKey() + ": " + letter.getValue() + "\n");
        }
    }
}
