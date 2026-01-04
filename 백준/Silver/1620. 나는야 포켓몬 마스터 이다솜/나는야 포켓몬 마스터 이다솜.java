import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();

        String[] N = br.readLine().split(" ");
        int a = Integer.parseInt(N[0]);
        String[] numToName = new String[a + 1];

        for (int i = 0; i < Integer.parseInt(N[0]); i++) {
            String line = br.readLine();
            map.put(line, i + 1);
            numToName[i + 1] = line;
        }

        for (int i = 0; i < Integer.parseInt(N[1]); i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                bw.write(numToName[Integer.parseInt(input)] + "\n");
            } else {
                bw.write(map.get(input) + "\n");
            }
        }
        bw.flush();
    }
}