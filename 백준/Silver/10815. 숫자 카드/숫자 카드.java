import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        String[] nums1 = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] nums2 = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < M; i++) {
            if(set.contains(nums2[i])){
                nums2[i] = "1";
            } else{
                nums2[i] = "0";
            }
            bw.write(nums2[i]+" ");
        }
        bw.flush();
    }
}