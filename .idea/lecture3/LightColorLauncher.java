package lecture3;

public class LightColorLauncher {
    public static void main (String[] args) {
        int waveLength = 350;
        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.detect(waveLength);
    }
}

