import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class practice1 {
    public static void main(String[]args) {
        String name1="ABCD";
        String output1=encrypt1(name1);
        System.out.println(output1);
    }
public static String encrypt1(String word1){
    List<String> list1=new ArrayList<>();
    List<String> list2=new ArrayList<>();
    list1.add("A");
    list1.add("B");
    list1.add("C");
    list1.add("D");
    list1.add("E");
    list1.add("F");

    list2.add("01");
    list2.add("02");
    list2.add("03");
    list2.add("04");
    list2.add("05");
    list2.add("06");

    String name=word1;
    int len1=name.length();
    String result="";
    for(int i=0;i<len1;i++){
        String temp1=name.substring(i,i+1);
        int position=list1.indexOf(temp1);
        String temp2=list2.get(position);
        result=result+temp1+"-"+temp2;
    }
    return result;
}
}