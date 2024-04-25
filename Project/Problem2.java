package Project;
import java.util.Scanner;

public class Problem2 {
	public static String convertToanyBase(int dec , int base){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        while(dec != 0){
            int r = dec%base;
            if(r >= 10){
                res = alpha.charAt(r-10) + res; 
            }else{
                res = r + res;
            }
            dec = dec/base;
        }

        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal value(base 10)");
        int dec = sc.nextInt();
        System.out.println("Enter the base to be converted into ");
        int base = sc.nextInt();
        String res = convertToanyBase(dec , base);
        System.out.println(dec + " after being converted to base " + base + " : " + res);
    }
}
