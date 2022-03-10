package uaslp.objetos.parcial2;

class Rectangle extends Figure {
    private float base;
    private float height;

    public Rectangle(float base, float height) {
        super("Rectángulo");

        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return (float) base * height;
    }

    public float getPerimeter() {
        return (float) base * 2 + height * 2;
    }
}
