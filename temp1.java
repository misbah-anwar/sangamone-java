public class temp1 {
    public static void main(String[]args){
        String s1="Dear $2name, you have to pay $3amount by $4date";
        String[] list1=s1.split(" ");
        int len1=list1.length;
        for(int i=0;i<len1;i++){
            String word1=list1[i];
            if(word1.contains("$")){
                int position1=word1.indexOf("$");
                String temp2=word1.substring(position1+1,position1+2);
                int index1=Integer.parseInt(temp2);
                System.out.println(index1);
            }
        }
    }
}
