import java.io.*;
import java.lang.System;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {        
        int valley=0;
        int currentLine=0;
                
        for(int i=0;i<path.length();i++)
        {
           switch(path.charAt(i))
           {
               
               case 'D':
               {
                   if(currentLine==0)
                    valley+=1;
                    
                   currentLine-=1; 
                   break;
               }
               case 'U':
               {
                   currentLine+=1;
                           
                   break;
               }
               default:
               {
                   break;
               }
           }
        }
        
         return valley;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
