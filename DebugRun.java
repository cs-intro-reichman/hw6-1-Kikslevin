import java.awt.Color;

public class DebugRun {
    public static void main(String[] args) {
        Color[][] img = null;
        try {
            img = Runigram.read("tinypic.ppm");
        } catch (Exception e) {
            System.out.println("Runigram.read threw an exception:");
            e.printStackTrace();
        }
        if (img == null) {
            System.out.println("read returned null");
            return;
        }
        System.out.println("Image size: rows=" + img.length + ", cols=" + img[0].length);
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                Color c = img[i][j];
                System.out.println("(" + i + "," + j + "): R=" + c.getRed() + ", G=" + c.getGreen() + ", B=" + c.getBlue());
            }
        }
    }
}
