package Regex_sr;
import java.util.*;
import java.util.regex.*;
public class email_validation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String a=sc.nextLine();
            Pattern pattern=Pattern.compile("([\\S]*@.*?\\.(com|in|net|org))");
            Matcher m=pattern.matcher(a);
            while(m.find()){
                h.add(m.group());

            }
        }
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

