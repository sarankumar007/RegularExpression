package Regex_sr;

import java.util.ArrayList;
import java.util.regex.*;


public class character_repeat {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<String>b=new ArrayList<>();
        String s="b3c6d15";
        Pattern p=Pattern.compile("(\\d+)");
        Matcher m=p.matcher(s);
        while(m.find()){
            a.add(Integer.parseInt(m.group()));
        }
        Pattern p1=Pattern.compile("([a-zA-Z])");
        Matcher m1=p1.matcher(s);
        while(m1.find()){
            b.add(m1.group());
        }
        for(int i=0;i<b.size();i++){
            System.out.print(b.get(i).repeat(a.get(i)));
        }
    }

}
