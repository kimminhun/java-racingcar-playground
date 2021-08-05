import java.util.Random;

public class Flag {

    public boolean StopOrGo(){
        Random r = new Random();
        int rannum = r.nextInt(10) ;
        if(rannum>=4) return true;
        else return false;
    }

}
