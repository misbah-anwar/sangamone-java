//author: Misbah
//this code does not generate a fixed quantity of random numbers because some numbers are less than 8 digits.This needs to be improved
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class otp_generator {
    public static void main(String[]args){
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        int otpsize=8;
        int otpqty=10;
        double rand1=0.0;
        double rand2=0.0;
        int rand3=0;
        for(int i=0;i<otpqty*10;i++){
            rand1=Math.random();
            rand2=rand1*Math.pow(10,otpsize);
            rand3=(int)rand2;
            list1.add(rand3);
        }
        for(int i=0;i<otpqty;i++){
            if(list1.get(i)>=Math.pow(10,otpsize-1)){
                list2.add(list1.get(i));
            }
        }
        int len2=list2.size();
        System.out.println(len2);
        for(int i=0;i<len2;i++){
            System.out.println(list2.get(i));
        }
    }
}
