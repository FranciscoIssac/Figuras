package uaslp.objetos.parcial2;

abstract class Figure {
    public static int figuresCreated;
    public final String name;

    protected Figure(String name) {
        this.name = name;
        figuresCreated++;
    }
    public abstract float getArea();

    public abstract float getPerimeter();

    public final String getName() {
        return name;
    }

    public static int getFiguresCreated() {
        return figuresCreated;
    }
}
