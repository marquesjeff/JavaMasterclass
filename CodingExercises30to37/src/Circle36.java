public class Circle36 {

    private double radius;

    public Circle36(double radius) {
        if(radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }
}

class Cylinder extends Circle36{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }
}