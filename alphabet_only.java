package Regex_sr;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alphabet_only {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
//        String input=sc.nextLine();
//        String r="saran";
//        //String r="[aeiou]";
//        //String r="[^aeiou]";(other than aeiou)
//        //String r="[a-z && [^bm]]";
//        Pattern pattern= Pattern.compile(r);
//        Matcher matcher= pattern.matcher(input);
//        int c=0;
//        while(matcher.find()){
//            c++;
//        }
//        System.out.println(c);
//    }
        int n=sc.nextInt();
        int x=1,t=x;
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
            t++;
            x=t;
        }

    }
}
//. Any character (may or may not match line terminators)
// \d A digit: [0-9]
// \D A non-digit: [^0-9]
// \s A whitespace character: [ \t\n\x0B\f\r]
// \S A non-whitespace character: [^\s]
// \w A word character: [a-zA-Z_0-9]
// \W A non-word character: [^\w]
