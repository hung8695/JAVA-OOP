package Retangle;

public class Retangle {
    double width, height;
    public Retangle(){
    }
    public Retangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
