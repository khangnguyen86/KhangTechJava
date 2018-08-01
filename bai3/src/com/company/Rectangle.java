package com.company;

public class Rectangle {
    private double width;
    private double height;
    //methods
    public double getCircumference() {
        return 2 * (width + height);
    }

    public double getArea(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    //setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    //rectangle1.comparewidth(rectangle2)
    public boolean comparewidth(Rectangle recX){
        return this.width > recX.width;
    }
    public boolean compareArea(Rectangle recX){
        return this.getArea() > recX.getArea();
    }

    //rectangle1.compare(rectangle2)

    public boolean compareWidthAndHeight(Rectangle recX) {
        return ((this.height == recX.height) && (this.width == recX.width));
    }

}
