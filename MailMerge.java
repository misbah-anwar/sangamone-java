import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class MailMerge {
    public static void findPos1(String s1) {
        List<Integer> numbers=new ArrayList<>();
        String[] list1 = s1.split(" ");
        int len1 = list1.length;
        for (int i = 0; i < len1; i++) {
            String word1 = list1[i];
            if (word1.contains("$")) {
                int position1 = word1.indexOf("$");
                String temp2 = word1.substring(position1 + 1, position1 + 2);
                int index1 = Integer.parseInt(temp2);
                numbers.add(index1);
            }
        }
        System.out.println(numbers);
    }
    public static void main(String[] args) throws FileNotFoundException {
        //identify the word which contains $
        File f1 = new File("C:\\Users\\misba\\Downloads\\java-practice\\src\\list1.txt");
        Scanner sc1 = new Scanner(f1);
        String line = sc1.nextLine();
        System.out.println(line);
        String[] list2;
        list2=line.split(", ");
        System.out.println(list2[1]);
        MailMerge.findPos1("Dear $2name, you have to pay $3amount by $4date");
        }
    }
