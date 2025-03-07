import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한줄 입력
        String line = br.readLine();
        // 공백 문자로 나눠서 토큰으로 저장
        StringTokenizer token = new StringTokenizer(line);

        // 토큰을 하나씩 가져와 정수형 변환
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        // 값 연산
        double result = (double) a / b;
        // bufferedWriter로 출력, 매개변수는 문자열
        bw.write("" + result);

        br.close();
        bw.close();
    }

}