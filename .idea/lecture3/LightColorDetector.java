package lecture3;

public class LightColorDetector {

    public void detect(int waveLength) {
        int detect = waveLength;
        if (detect >= 380 && detect <= 449)
        {System.out.println("Violet");}
        else if (detect >= 450 && detect <= 494)
        {System.out.println("Blue");}
        else if (detect >= 495 && detect <= 569)
        {System.out.println("Green");}
        else if (detect >= 570 && detect <= 589)
        {System.out.println("Yellow");}
        else if (detect >= 590 && detect <= 619)
        {System.out.println("Orange");}
        else if (detect >= 620 && detect <= 750)
        {System.out.println("Red");}
        else if ((detect < 380) || (detect > 750))
        {System.out.println("Invisible Light");}
    }
}
