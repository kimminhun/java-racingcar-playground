import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class Referee {

    public Queue<Car> result(Queue<Car> queue){
        Flag flag = new Flag();
        if(flag.StopOrGo()) {
            Car x=queue.poll();
            x.location+=1;
            queue.offer(x);
            return queue;
        } else return queue;
    }

    public StringBuilder print(Queue<Car> queue){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queue.size(); i++) {
            Car tmp = queue.poll();
            sb.append(tmp.name + ":  ");
            for (int j = 0; j <tmp.location ; j++) {
                sb.append("-");
            }
            sb.append("\n");
            queue.add(tmp);
        }
        return sb;
    }

}
