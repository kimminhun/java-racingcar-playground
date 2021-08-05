import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RacingInfo {

    public List<String> carInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        List<String> carinfo = new ArrayList<>();
        while (st.hasMoreTokens()){
            carinfo.add(st.nextToken());
        }
        return carinfo;
    }

    public int tryNum() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("시도할 횟수는 몇회인가요?");
        int tryNum = Integer.parseInt(br.readLine());
        return tryNum;
    }


}
