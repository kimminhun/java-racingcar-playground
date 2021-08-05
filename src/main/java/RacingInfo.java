import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RacingInfo {

    public Queue<Car> carInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        Queue<Car> carinfo = new LinkedList<>();
        while (st.hasMoreTokens()){
            Car c=new Car();
            c.name=st.nextToken();
            c.location=0;
            carinfo.add(c);
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
