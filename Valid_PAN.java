package Regex_sr;
import java.util.*;
import java.util.regex.*;
public class Valid_PAN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            Pattern p=Pattern.compile("^([A-Z]){5}\\d{4}[A-Z]$");
            Matcher m=p.matcher(a);
            System.out.println(m.find()?"YES":"NO");
        }
    }
}
