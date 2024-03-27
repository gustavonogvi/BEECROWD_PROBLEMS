package BEE_PROBLEMS_BASICS;

public class Bee1096{
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        while(i<=9){
            System.out.println("I="+ i +" J=" + j);
            j -=1;
            if(j<5){
                i+=2;
                j=7;
            }
        }
    }
}
