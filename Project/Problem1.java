package Project;
import java.util.Scanner;
public class Problem1 {
	public static void rotateRightBy2Bits(int ar[]){
        String str[] = new String[ar.length];
        for(int i = 0 ; i < ar.length ; i++){
            String curr = Integer.toBinaryString(ar[i]);
            int temp = curr.length();
            for(int j = 1 ; j <= 32-temp ; j++){
                curr = "0" + curr;
            }
            str[i] = curr;
        }
        String  curr_ele = str[0].substring(str[0].length() - 2, str[0].length());
        for(int i = 1 ; i < str.length ; i++){
            String temp = curr_ele;
            curr_ele = str[i].substring(str[i].length() - 2, str[i].length());
            str[i] = temp + str[i].substring(2 , str[i].length()-2);
        }
        str[0] = curr_ele + str[0].substring(2 , str[0].length()-2);

        System.out.print("The Array After Rotation (Binary Form) :");
        for(int i = 0 ; i < str.length ; i++){
            System.out.print(" " + str[i]);
        }
        System.out.println(" ");

        System.out.print("The Array After Rotation (integer Form) :");
        for(int i = 0 ; i < str.length ; i++){
            String temp = str[i];
            long res = 0;
            int count = 0;
            for(int k = temp.length()-1 ; k >= 0  ; k--){
                if(temp.charAt(k) == '1'){
                    res = res + (int)Math.pow(2, count);
                }
                count++;
            }
        System.out.print(" " + res);
        
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[4];
        System.out.println("Enter the elements");

        for(int i = 0 ; i < ar.length ; i++){
            ar[i] = sc.nextInt();
        }

        System.out.print("The Array In integer Form :");
        for(int i = 0 ; i < ar.length ; i++){
            System.out.print(" " + ar[i]);
        }
        System.out.println(" ");
        System.out.print("The Array In binary (32-bit) Form :");
        for(int i = 0 ; i < ar.length ; i++){
            String curr = Integer.toBinaryString(ar[i]);
            int temp = curr.length();
            for(int j = 1 ; j <= 32-temp ; j++){
                curr = "0" + curr;
            }
            System.out.print(" " + curr);
        }
        System.out.println(" ");
        rotateRightBy2Bits(ar);
    }
}


