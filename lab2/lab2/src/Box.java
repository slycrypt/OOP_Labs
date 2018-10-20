public class Box {

    private double length;
    private double width;
    private double height;

    public Box (){

    }

    public Box (double parameter) {

        this.height = parameter;
        this.width = parameter;
        this.length = parameter;

    }

    public Box (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public double getheight() {
        return height;
    }

    public double getwidth() {
        return width;
    }

    public double getArea (){
        if(this.height == this.width  && this.width== this.length){
            return this.height * this.height * 6;
        }
        else {
            return 2*(this.length * this.height + this.length * this.width + this.height * this.width);
        }

    }

    public double getVolume (){

        return this.length * this.height * this.width;

    }
}
