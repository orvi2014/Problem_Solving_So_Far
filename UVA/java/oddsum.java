// Uva 10783 - Odd Sum
// Author: Robat Das

import java.util.Scanner;
public class oddsum{
  public static void main(String[]args){
  Scanner k=new Scanner(System.in);
  int testcase=k.nextInt();
  for(int i = 1; i < testcase+1; i++) {  
                int a = k.nextInt();  
                int b = k.nextInt();  
                int sum=0;
                System.out.print("Case " + i + ": "); 
                for (int j=a; j<=b; j++){
                  if (j%2!=0){
                  sum+=j;}}
                  System.out.println(sum);
  
  
  }
}
}
