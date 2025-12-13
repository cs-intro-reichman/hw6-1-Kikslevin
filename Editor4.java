import java.awt.Color;
public class Editor4 {

    public static void main(String[] args){
        //Morph an image into its greyscaled version
    String Source = args[0];
    int n = Integer.parseInt(args[2]);

    Color[][] source = Runigram.read(Source);
    Color[][] gray = Runigram.grayScaled(source);
    Runigram.setCanvas(source);
    Runigram.morph(source, gray, n);

    }
}
