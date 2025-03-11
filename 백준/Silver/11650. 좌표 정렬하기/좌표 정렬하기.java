import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
   
    static class Pair {
        public int first;
        public int second;
        
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 점의 개수 n 입력
        int times = Integer.parseInt(br.readLine());
        
        // n개의 점 입력
        List<Pair> arr = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new Pair(x, y));
        }
        
        // 오름차순 정렬 결과 출력
        Collections.sort(arr, (a, b) -> {
            if (a.first == b.first) {
                return a.second - b.second;
            }
            return a.first - b.first;
        });

        for (Pair v : arr) {
            bw.write(v.first + " " + v.second + "\n");
        }

        br.close();
        bw.close();
    }
}