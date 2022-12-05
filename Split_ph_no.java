package Regex_sr;
import java.util.*;
import java.util.regex.*;
public class Split_ph_no {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Pattern p=Pattern.compile("^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})$");

        for( int i=0;i<n;i++){
            String t=sc.nextLine();
            Matcher m=p.matcher(t);
            while(m.find()){
                System.out.println("CountryCode="+m.group(1)+",LocalAreaCode="+m.group(2)+",Number="+m.group(3));
            }

        }



    }
}
// (?i) case-insensitive mode ON
//        (?-i) case-insensitive mode OFF
//        Modern regex flavors allow you to apply modifiers to only part of the regular expression.
//        If you insert the modifier (?im) in the middle of the regex then the modifier only applies to the part of the regex to the right of the modifier.
//        With these flavors, you can turn off modes by preceding them with a minus sign (?-i).

 /*   Sample Input

        2
        1 877 2638277
        91-011-23413627

        Sample Output
  CountryCode=1,LocalAreaCode=877,Number=2638277
  CountryCode=91,LocalAreaCode=011,Number=23413627

  */
