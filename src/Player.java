import processing.core.PImage;

public class Player {
    private PImage img;
    private boolean player1;
    private int xpos;
    private int ypos;
    private int increment = 15;



    public Player(PImage img, int xpos, int ypos) {
        this.img = img;
        this.player1 = player1;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public PImage getImg() {
        return img;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setXpos(int input){
        xpos = input;
    }

    public void setYpos(int input){
        ypos = input;
    }
}
