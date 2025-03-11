import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 수의 개수 입력
        int times = Integer.parseInt(br.readLine());
        
        // n개의 수 입력
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        
        // 오름차순 정렬 결과 출력
        Collections.sort(numbers, (a, b) -> a - b);

        for (int number : numbers) {
            bw.write(number + "\n");
        }

        br.close();
        bw.close();
    }
}