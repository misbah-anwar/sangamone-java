import java.util.*;
public class generatePass {
    public static void main(String[]args){
//        ArrayList<String> upper1=new ArrayList<>();
//        ArrayList<String> lower1=new ArrayList<>();
//        ArrayList<Integer> digit1=new ArrayList<>();
//        for(int i=65;i<65+26;i++)
//        {
//            char uppercase=(char)i;
//            upper1.add(String.valueOf(uppercase));
//        }
//        System.out.println(upper1);
//
//        for(int i=97;i<97+26;i++)
//        {
//            char lowercase=(char)i;
//            lower1.add(String.valueOf(lowercase));
//        }
//        System.out.println(lower1);
//
//        for(int i=0;i<10;i++){
//            digit1.add(i);
//        }
//        System.out.println(digit1);
//        int size=6;
//        double rand1=Math.random();
//        int rand2= (int)(rand1*Math.pow(10,size));
//        System.out.println(rand1);
//        System.out.println(rand2);
        ArrayList<Character> pass1=new ArrayList<>();
        Random rand=new Random();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<3;i++) {
            char randomupper = (char) (rand.nextInt(26) + 'A');
            System.out.print(randomupper);
            pass1.add(randomupper);
        }
        for(int i=0;i<3;i++) {
            char randomlower = (char) (rand.nextInt(26) + 'a');
            System.out.print(randomlower);
            pass1.add(randomlower);
        }
        for(int i=0;i<3;i++) {
            char randomdigit = (char)(rand.nextInt(10) + '0');
            System.out.print(randomdigit);
            pass1.add(randomdigit);
        }
        System.out.println(pass1);
        int size=3;
        for(int i=0;i<6;i++){
            int index= rand.nextInt(pass1.size());
            str.append(pass1.get(index));
        }
        System.out.println(str);
    }
}
