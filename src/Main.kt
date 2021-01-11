import shape.CustomShape
import shape.ShapeType
import java.lang.Error

fun main() {
    var appShapeType: ShapeType = ShapeType.ELLIPSE
    var appShapeFactory: ShapeFactory = when(appShapeType) {
        ShapeType.ELLIPSE -> EllipseShapeFactory()
        ShapeType.RECTANGLE -> RectShapeFactory()
        else -> throw Error("undeclared shape type!")
    }

    val eq: CustomShape = appShapeFactory.getEq(13.2f)
    val notEq: CustomShape = appShapeFactory.getNotEq(10.1f, 2.2f)

    printAreaInfo(eq)
    printAreaInfo(notEq)
}

fun printAreaInfo(shape: CustomShape) {
    println("area of " + shape.getShapeType() + " is: " + shape.getArea())
}