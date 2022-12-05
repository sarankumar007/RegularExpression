package Regex_sr;
import java.util.*;
import java.util.regex.*;
public class Detect_domains{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String a=sc.nextLine();
            Pattern pattern=Pattern.compile("http[s]?:\\/\\/(ww[w2]\\.)?(([a-zA-Z0-9\\-]+\\.)+([a-zA-Z\\-])+)");
            Matcher m=pattern.matcher(a);
            while(m.find()){
                h.add(m.group().replaceAll("(http[s]?:\\/\\/)|(ww[w2]\\.)",""));

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


