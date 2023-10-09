package geometrique;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] geometries = new ObjetGeometrique[2];

        ObjetGeometrique circle = new Cercle(4);
        ObjetGeometrique Rectangle = new Rectangle(10, 5);

        geometries[0] = circle;
        geometries[1] = Rectangle;

        for (ObjetGeometrique geometry : geometries) {
            System.out.println(geometry);
        }
    }
}
