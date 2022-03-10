package uaslp.objetos.parcial2;

class Circle extends Figure {
    private float radio;

    public Circle(float radio) {
        super("Círculo");

        this.radio = radio;
    }

    public float getArea() {
        return (float) Math.PI * radio * radio;
    }

    public float getPerimeter() {
        return (float) Math.PI * radio * 2;
    }
}
