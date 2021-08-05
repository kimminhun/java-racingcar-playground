import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class onGoing {
    public Queue result(Queue<Car> queue){
        Flag flag = new Flag();
        if(flag.StopOrGo()) {
            Car x=queue.poll();
            x.location+=1;
            queue.offer(x);
            return queue;
        } else return queue;
    }

}
