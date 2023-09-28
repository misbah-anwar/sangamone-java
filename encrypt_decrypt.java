import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class practice1 {
    static List<String> list1 = new ArrayList<>();
    static List<String> list2 = new ArrayList<>();
    static List<String> list3 = new ArrayList<>();
    static String name2="04030201";
    public static void main(String[] args) {
        String name1 = "I AM INJURED";
        String name2="04030201";
        System.out.println(encrypt1(name1));
        System.out.println(decrypt1());
    }

    public static List<String> encrypt1(String word1) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");
        list1.add("H");
        list1.add("I");
        list1.add("J");
        list1.add("K");
        list1.add("L");
        list1.add("M");
        list1.add("N");
        list1.add("O");
        list1.add("P");
        list1.add("Q");
        list1.add("R");
        list1.add("S");
        list1.add("T");
        list1.add("U");
        list1.add("V");
        list1.add("W");
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.add(" ");

        list2.add("01");
        list2.add("02");
        list2.add("03");
        list2.add("04");
        list2.add("05");
        list2.add("06");
        list2.add("07");
        list2.add("08");
        list2.add("09");
        list2.add("10");
        list2.add("11");
        list2.add("12");
        list2.add("13");
        list2.add("14");
        list2.add("15");
        list2.add("16");
        list2.add("17");
        list2.add("18");
        list2.add("19");
        list2.add("20");
        list2.add("21");
        list2.add("22");
        list2.add("23");
        list2.add("24");
        list2.add("25");
        list2.add("26");
        list2.add("99");

        String name = word1;
        int len1 = name.length();
        String result = "";
        for (int i=0; i<len1; i++) {
            String temp1 = name.substring(i, i+1);
            int position = list1.indexOf(temp1);
            String temp2 = list2.get(position);
            result = result+temp2;
        }
        list3.add(name);
        list3.add(result);
        return list3;
    }

    public static List<String> decrypt1() {

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");
        list1.add("H");
        list1.add("I");
        list1.add("J");
        list1.add("K");
        list1.add("L");
        list1.add("M");
        list1.add("N");
        list1.add("O");
        list1.add("P");
        list1.add("Q");
        list1.add("R");
        list1.add("S");
        list1.add("T");
        list1.add("U");
        list1.add("V");
        list1.add("W");
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.add(" ");

        list2.add("01");
        list2.add("02");
        list2.add("03");
        list2.add("04");
        list2.add("05");
        list2.add("06");
        list2.add("07");
        list2.add("08");
        list2.add("09");
        list2.add("10");
        list2.add("11");
        list2.add("12");
        list2.add("13");
        list2.add("14");
        list2.add("15");
        list2.add("16");
        list2.add("17");
        list2.add("18");
        list2.add("19");
        list2.add("20");
        list2.add("21");
        list2.add("22");
        list2.add("23");
        list2.add("24");
        list2.add("25");
        list2.add("26");
        list2.add("99");

        int len2 = name2.length();
        String result = "";
        for (int i=0; i<len2; i+=2) {
            String temp1 = name2.substring(i,i+2);
            int position = list2.indexOf(temp1);
            if (position != -1) {
                String temp2 = list1.get(position);
                result =temp2+result;
            }
        }
        list3.add(name2);
        list3.add(result);
        return list3;
    }
}
