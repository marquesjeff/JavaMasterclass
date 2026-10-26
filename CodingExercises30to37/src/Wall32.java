public class Wall32 {

    private double width;
    private double height;

    public Wall32() {
        this(0, 0);
    }

    public Wall32(double width, double height) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }
}
