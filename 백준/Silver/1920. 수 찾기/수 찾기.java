import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 입력 받기
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // 정렬

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            
            if (binarySearch(A, target)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    // 이진 탐색 구현
    private static boolean binarySearch(int[] A, int key) {
        int left = 0, right = A.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (A[mid] == key) return true;
            
            if (A[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
