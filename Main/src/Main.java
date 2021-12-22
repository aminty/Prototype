public class Main {

    public static void main(String[] args) {
        ShapeCache.loadShape();

        //Note: these returned object is not new instance from actual class.
        // but they are a copy of actual class.

        Shape firstShape=ShapeCache.getShape("1");
        System.out.println("shape type: "+firstShape.getType());

        Shape secondShape=ShapeCache.getShape("2");
        System.out.println("shape type: "+secondShape.getType());
    }
}
