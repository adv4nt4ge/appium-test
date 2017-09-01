/**
 * Created by DKovtunov.ua on 15.11.2016.
 */
public final class Sleeper {
    private Sleeper() {
    }

    public static void pause(int seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}
