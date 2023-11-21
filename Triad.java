public class Triad{
    public static void main(String[] args){
        int end=100;
        System.out.println("triads upto "+end+":");

        for (int a=1; a<=end; a++){
            for (int b=a+1; b<=end; b++){
                int c=a*a + b*b;
                int d=(int)Math.sqrt(c);

                if (d<=end && (a*a+b*b==d*d)){
                    System.out.println(a+", "+b+", "+d);
                }
            }
            System.out.println("not a triad");
        }
    }
}


