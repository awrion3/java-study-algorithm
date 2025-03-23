import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		int[] arr = new int[N];
 
		st = new StringTokenizer(br.readLine(), " ");
        
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
        
		System.out.println(result);
	}
 
	
	// M을 넘지 않는, M에 가까운 합 탐색
	static int search(int[] arr, int N, int M) {
		int result = 0;
 
		// 첫번째 카드: N - 2 까지만 순회
		for (int i = 0; i < N - 2; i++) {
			
			// 첫 번째 카드가 M보다 크면 스킵한다
			if(arr[i] > M) 
                continue;
			
			// 두 번째 카드: 첫 번째 카드 다음 ~ N - 1 까지만 순회
			for (int j = i + 1; j < N - 1; j++) {
 
				// 두 번째 카드 + 첫 번째 카드의 합이 M보다 크면 스킵한다
				if(arr[i] + arr[j] > M) 
                    continue;
				
				// 세 번째 카드: 두 번째 카드 다음 ~ N 까지 순회
				for (int k = j + 1; k < N; k++) {
					
					// 3개 카드 합을 temp에 저장
					int temp = arr[i] + arr[j] + arr[k];
					
					// M == 세 카드의 합이 같다면, temp 값을 return
					if (M == temp) {	
						return temp;
					}
					
					// 세 카드의 합 > 이전 합보다 크면서, M보다는 작을 경우, result 갱신 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		
		// 모든 순회를 마친 후, result 값을 return
		return result;
	}
}