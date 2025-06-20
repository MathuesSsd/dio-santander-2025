package Area;

public record Reactangle(double height, double base) implements GeometricForm {
    
    @Override
    public double getArea(){
        return height*base;
    }
}
