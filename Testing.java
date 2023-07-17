import java.util.*;
import java.lang.*;



public class Testing {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        System.out.println("1. Encode \n2. Decode");
        int a = sc.nextInt();

        if (a==1){

            System.out.println("Enter Message file");
            String usermsg = sc.next();

            CP1.AES.AES_Encode(usermsg);


            System.out.println("Enter cover image file [jpg]");
            CP2.Encode.COVERIMAGEFILE = sc.next();


            CP2.Encode.LSB_encode();
        }

        else if (a==2) {

            System.out.println("Enter Encrypted file");
            CP3.Decode.STEGIMAGEFILE = sc.next();

           CP3.Decode.LSB_decode();
           CP1.AES.AES_Decode();



        }


    }
}