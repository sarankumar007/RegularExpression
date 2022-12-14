package Regex_sr;
import java.awt.*;
import java.util.*;
import java.util.regex.*;
public class ipv4_ipv6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String t=sc.nextLine();
            Pattern p=Pattern.compile("^((\\d|[01]?\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[01]?\\d\\d|2[0-4]\\d|25[0-5])$");
            Matcher m=p.matcher(t);
            Pattern pa=Pattern.compile("^(([\\da-fA-F]{1,4}):){7}([\\da-fA-F]{1,4})$");
            Matcher ma=pa.matcher(t);
            if(m.find())
                System.out.println("IPv4");
            else if(ma.find())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}

