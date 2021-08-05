import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        RacingInfo carInput = new RacingInfo();
        List<String> ar = carInput.carInfo();
        System.out.println(ar);
    }
}
