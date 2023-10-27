import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class quizContest {
    public static void main(String[]args)throws FileNotFoundException{
        File f1=new File("src/Capitals.csv");
        Scanner sc=new Scanner(f1);
        String[] list1;
        List<String>country=new ArrayList<>();
        List<String>capital=new ArrayList<>();
        List<Integer>marks=new ArrayList<>();
        List<Integer>wrong=new ArrayList<>();
        int total=0;
        while(sc.hasNextLine())
        {
            list1=sc.nextLine().split(",");
            country.add(list1[0]);
            capital.add(list1[1]);
        }
        Scanner sc1=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("What is the capital of "+country.get(i)+": ");
            String response1=sc1.nextLine();
            if(response1.equals(capital.get(i))){
                marks.add(10);
            }
            else{
                marks.add(0);
                wrong.add(i);
            }
            total=total+ marks.get(i);
        }
        System.out.println(total);
//        System.out.println(country);
//        System.out.println(capital);

    }
}
