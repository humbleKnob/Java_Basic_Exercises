public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getDiagonal(){
        return Math.sqrt((width*width) + (length * length));
    }
    public boolean isSquare(){
        if(length == width){
            return true;
        } else {
            return false;
        }
    }
}
