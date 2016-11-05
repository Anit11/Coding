import java.io.*;
import java.util.*;
import java.util.HashMap;

public class firstRepeatingCharacter {

char c;

public boolean findRepeat(String str) {

    HashMap<Character, Integer> ham = new HashMap<> ();
    int count = 0;
    for(int i=0; i<str.length(); i++)
    {
        c = str.charAt(i);
        if (ham.containsKey(c)) {
            return true;
        }

        else {
           ham.put(c, ++count); 
        }
    }
    return false;
    
}

private void printRepeat(Boolean bool) {
    
    if(bool == true) {
        System.out.println("The first repeated character in the given word is "+c);
    }
    else {
        System.out.println("All the characters in the word is unique");
    }
}


public static void main(String args[]) {
    
    System.out.println("Enter the String: ");
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    firstRepeatingCharacter frc = new firstRepeatingCharacter();

    Boolean b = frc.findRepeat(word);
    frc.printRepeat(b);
}
}
