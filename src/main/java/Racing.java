import java.io.IOException;
import java.util.Queue;

public class Racing {

    static StringBuilder sb = new StringBuilder();

    public void racing() throws IOException {
        RacingInfo racingInfo = new RacingInfo();
        Queue<Car> que = racingInfo.carInfo();
        int round = racingInfo.tryNum();
        Referee onGoing = new Referee();
        while (round-->0){
            for (int i = 0; i < que.size(); i++) {
                onGoing.result(que);
            }
            sb=onGoing.print(que);
            System.out.println(sb);
        }

    }


}
