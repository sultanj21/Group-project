package project;

/**
 * @author: medo , sultan
 * @course: itec 2140
 * @section: 09 fall
 * @decsription: this program finds the volume given three objects width height and depth
 * @quistion:Your asked to create a program that takes three measurements Hight, width, depth and give you the volume of them?
 */
public class Volume {
    private int height;
    private int width;
    private int depth;

    public Volume(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Volume ={" + height * width *  depth + '}';
    }

}

