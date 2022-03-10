package uaslp.objetos.parcial2;

public class Polygon extends Figure {
    private float apotema;
    private int sidesCount;
    private float sidesLength;

    public Polygon(float apotema, int sidesCount, float sidesLength) {
        super("Polígono");

        this.apotema = apotema;
        this.sidesCount = sidesCount;
        this.sidesLength = sidesLength;
    }

    public float getArea() {
        return (float) getPerimeter() * apotema / 2;
    }

    public float getPerimeter() {
        return (float) sidesCount * sidesLength;
    }
}
