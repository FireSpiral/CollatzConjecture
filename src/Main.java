import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int count = 0;
            System.out.println("Enter a value ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            while(n!=1){
                if(n%2==0) {
                    n = n / 2;
                }else{
                    n=(3*n)+1;
                }
                System.out.println(n);
                count++;
            }

            System.out.println("That took " + count + " tries");
        }
    }


