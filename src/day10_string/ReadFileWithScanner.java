package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFileWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));
/* reads line by line
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        */

      /*  System.out.println(scan.next()); // reads word by word
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
      */
       // System.out.println(scan.hasNext());

        scan.close();

    }
}