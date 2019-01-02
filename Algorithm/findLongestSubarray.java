import java.io.*;
import java.util.*;

public class findLongestSubarray {
    public static void main(String args[]) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        ar.add(74);
        ar.add(659);
        ar.add(931);
        ar.add(273);
        ar.add(545);
        ar.add(879);
        ar.add(924);
        ar.add(710);
        ar.add(441);
        ar.add(166);
        ar.add(493);
        ar.add(43);
        ar.add(988);
        ar.add(504);
        ar.add(328);
        ar.add(730);
        ar.add(841);
        ar.add(613);
        ar.add(304);
        ar.add(170);
        ar.add(710);
        ar.add(158);
        ar.add(561);
        ar.add(934);
        ar.add(100);
        ar.add(279);
        ar.add(817);
        ar.add(336);
        ar.add(98);
        ar.add(827);
        ar.add(513);
        ar.add(268);
        ar.add(811);
        ar.add(634);
        ar.add(980);
        ar.add(150);
        ar.add(580);
        ar.add(822);
        ar.add(968);
        ar.add(673);
        ar.add(394);
        ar.add(337);
        ar.add(486);
        ar.add(746);
        ar.add(229);
        ar.add(92);
        ar.add(195);
        ar.add(358);
        ar.add(2);
        ar.add(154);
        ar.add(709);
        ar.add(945);
        ar.add(669);
        ar.add(491);
        ar.add(125);
        ar.add(197);
        ar.add(531);
        ar.add(904);
        ar.add(723);
        ar.add(667);
        ar.add(550);

        int ans = findLength(ar, 22337);
        System.out.println(ans);
    }

    public static int findLength(ArrayList<Integer> aList, int num) {
        int len = 0;
        int tot = 0;

        Collections.sort(aList);

        for(int i=0; i<aList.size(); i++) {

            if(aList.get(i) < num) {
                if(tot + aList.get(i) <= num) {
                    tot = tot + aList.get(i);
                    len++;
                }
                else {
                    i = aList.size()+1;
                }
            }
            else {
                i = aList.size()+1;
            }
        }

        return len;

    }
}
