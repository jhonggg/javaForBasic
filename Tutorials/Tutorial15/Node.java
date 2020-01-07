package Tutorial15;

public class Node{

    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public Node(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Node getCenter(final Node other){
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }

}