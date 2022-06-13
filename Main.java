import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class Main {
  public static void main(String[] args) throws IOException {
  
    int pass = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the password generator!\nPlease select which type of password you would like to generate.");

    for (int playsRemaining = 5; playsRemaining > 0; playsRemaining--) 
    {
      if(pass>0)
      {
        System.out.println("Do you wish to generate a different password? Type 0 to quit.");
      }
      System.out.println("1. Lowercase letters\n2. Uppercase letters\n3. Uppercase and Lowercase letters\n4. Uppercase, Lowercase, and Numbers\n5. Uppercase, Lowercase, Numbers, and Symbols\n0. Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");

      int selection = scan.nextInt();

      if (selection == 1) {
        File fileName1 = new File("Lower.txt");
        PrintWriter outFile1 = new PrintWriter(fileName1);
        for (int loop = 1; loop <= 1000; loop++) {
          int lc = (int) (Math.random() * (122 - 97 + 1) + 97);
          outFile1.println(lc);
        }
        outFile1.close();

        int[] lowerInts = new int[1000];

        File xfileName1 = new File("Lower.txt");
        Scanner inputFile1 = new Scanner(xfileName1); // new Scanner
        int index1 = 0;
        while (inputFile1.hasNextInt()) {
          lowerInts[index1] = inputFile1.nextInt();
          index1++;
        }
        inputFile1.close();


        String[] lower = new String[1000];
        for (int i = 0; i < lower.length; i++) {
          lower[i] = Character.toString((char) lowerInts[i]);
        }
        //Creates Lowerpw File
        File ffileName1 = new File("Lowerpw.txt"); // final file name 1
        PrintWriter foutFile1 = new PrintWriter(ffileName1); // final outfile 1
        int perLine = 0;
        for (int i = 0; i < lower.length; i++) {
          foutFile1.print(lower[i]);// going to make 125 passwords, 8 per line
          perLine++;
          if (perLine == 8) {
            foutFile1.println();
            perLine = 0;
          }
        }
        foutFile1.close();
        } 
        
        if (selection == 2) 
        {
        //Creates the Upper Case Letter File
        File fileName2 = new File("Upper.txt");
        PrintWriter outFile2 = new PrintWriter(fileName2);
        for (int loop = 1; loop <= 1000; loop++) 
        {
          int uc = (int) (Math.random() * (90 - 65 + 1) + 65);
          outFile2.println(uc);
        }
        outFile2.close();

        int[] upperInts = new int[1000];

        File xfileName2 = new File("Upper.txt");
        Scanner inputFile2 = new Scanner(xfileName2); // new Scanner
        int index2 = 0;
        while (inputFile2.hasNextInt()) {
          upperInts[index2] = inputFile2.nextInt();
          index2++;
        }
        inputFile2.close();

        String[] upper = new String[1000];
        for (int i = 0; i < upper.length; i++) {
          upper[i] = Character.toString((char) upperInts[i]);
        }
        
        File ffileName2 = new File("Upperpw.txt");
        PrintWriter foutFile2 = new PrintWriter(ffileName2);
        int perLine2 = 0;
        for (int i = 0; i < upper.length; i++) {
          foutFile2.print(upper[i]);
          perLine2++;
          if (perLine2 == 8)// not printing on individual lines
          {
            foutFile2.println();
            perLine2 = 0;
          }
        }
        foutFile2.close();
      }
      
      if (selection == 3) {
        File fileName3 = new File("Mixed_letters.txt");
        PrintWriter outFile3 = new PrintWriter(fileName3);
        for (int loop = 1; loop <= 1000; loop++) {
          int mxl = (int) (Math.random() * (122 - 65 + 1) + 65); // within two ranges
          while (mxl >= 91 && mxl < 97) {
            mxl = (int) (Math.random() * (90 - 65 + 1) + 65);
          }
          outFile3.println(mxl);
        }
        outFile3.close();

        int[] mixedLetInts = new int[1000];

        File xfileName3 = new File("Mixed_letters.txt");
        Scanner inputFile3 = new Scanner(xfileName3); // new Scanner
        int index3 = 0;
        while (inputFile3.hasNextInt()) {
          mixedLetInts[index3] = inputFile3.nextInt();
          index3++;
        }
        inputFile3.close();

        String[] mixed = new String[1000];
        for (int i = 0; i < mixed.length; i++) {
          mixed[i] = Character.toString((char) mixedLetInts[i]);
        }

        File ffileName3 = new File("Mixedpw.txt");
        PrintWriter foutFile3 = new PrintWriter(ffileName3);
        int perLine3 = 0;
        for (int i = 0; i < mixed.length; i++) {
          foutFile3.print(mixed[i]);
          perLine3++;
          if (perLine3 == 8) {
            foutFile3.println();
            perLine3 = 0;
          }
        }
        foutFile3.close();
      }
      if (selection == 4) {
        //Creates Mixed Letters and Numbers File
        File fileName4 = new File("Mixed_letters_numbers.txt");
        PrintWriter outFile4 = new PrintWriter(fileName4);
        for (int loop = 1; loop <= 1000; loop++) {
          int mxln = (int) (Math.random() * (122 - 48 + 1) + 48); // within three ranges
          while ((mxln >= 58 && mxln < 65) || (mxln >= 91 && mxln < 97)) {
            mxln = (int) (Math.random() * (122 - 48 + 1) + 48);
          }
          outFile4.println(mxln);
        }
        outFile4.close();

        int[] mixedLetNumInts = new int[1000];
        
        File xfileName4 = new File("Mixed_letters_numbers.txt");
        Scanner inputFile4 = new Scanner(xfileName4); // new Scanner
        int index4 = 0;
        while (inputFile4.hasNextInt()) {
          mixedLetNumInts[index4] = inputFile4.nextInt();
          index4++;
        }
        inputFile4.close();

        String[] mixedNum = new String[1000];
        for (int i = 0; i < mixedNum.length; i++) {
          mixedNum[i] = Character.toString((char) mixedLetNumInts[i]);
        }
        File ffileName4 = new File("MixedNumpw.txt");
        PrintWriter foutFile4 = new PrintWriter(ffileName4);
        int perLine4 = 0;
        for (int i = 0; i < mixedNum.length; i++) {
          foutFile4.print(mixedNum[i]);
          perLine4++;
          if (perLine4 == 8) {
            foutFile4.println();
            perLine4 = 0;
          }
        }
        foutFile4.close();
      }
      if (selection == 5) 
      {
         //Creates the Mixed_chars file
        File fileName5 = new File("Mixed_chars.txt");
        PrintWriter outFile5 = new PrintWriter(fileName5);
        for (int loop = 1; loop <= 1000; loop++) {
          int all = (int) (Math.random() * (125 - 33 + 1) + 33); // within three ranges
          outFile5.println(all);
        }
        outFile5.close();

        int[] allCharsInts = new int[1000];
        File xfileName5 = new File("Mixed_chars.txt");
        Scanner inputFile5 = new Scanner(xfileName5); // new Scanner
        int index5 = 0;
        while (inputFile5.hasNextInt()) {
          allCharsInts[index5] = inputFile5.nextInt();
          index5++;
        }
        inputFile5.close();

        String[] allChars = new String[1000];
        for (int i = 0; i < allChars.length; i++) {
          allChars[i] = Character.toString((char) allCharsInts[i]);
        }
        //Creates AllCharsPW File and Generates charcters
        File ffileName5 = new File("AllCharspw.txt");
        PrintWriter foutFile5 = new PrintWriter(ffileName5);
        int perLine5 = 0;
        for (int i = 0; i < allChars.length; i++) {
          foutFile5.print(allChars[i]);
          perLine5++;
          if (perLine5 == 8) {
            foutFile5.println();
            perLine5 = 0;
          }
        }
        foutFile5.close();
      }

      if (selection == 0) {
        playsRemaining = 0;
        System.out.println("Goodbye!");
      }

      pass++;
    }

  }
}