package rikkei.academy;

public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
    }
    public Square() {

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public String toString() {
        return "A Square width side= "+getSide()+", which is a subclass of " + super.toString();
    }
}
