import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String input = br.readLine();

        int sum = input.chars()
                       .map(Character::getNumericValue)
                       .sum();
   
        bw.write("" + sum);
           
        br.close();
        bw.close();
    }
}