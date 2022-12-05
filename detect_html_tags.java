package Regex_sr;
import java.util.*;
import java.util.regex.*;

public class detect_html_tags {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        System.out.println("Enter no.of.lines:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the "+i+"th line:");
            String a=sc.nextLine();
            Pattern pattern=Pattern.compile("(?<=<)([a-zA-Z0-9]+)");
            Matcher m=pattern.matcher(a);
            while(m.find()){
                h.add(m.group());
            }
        }
        if(h.isEmpty()) {
            System.out.println("No html tags detected!");
            System.exit(0);
        }
        System.out.println();
        String [] ans=new String[h.size()];
        int j=0;
        for(String ch:h){
            ans[j++]=ch;
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            if(i!=ans.length-1)
                System.out.print(ans[i]+";");
            else
                System.out.print(ans[i]);
        }

    }
}

