import shape.Circle
import shape.CustomShape
import shape.Ellipse

class EllipseShapeFactory: ShapeFactory {
    override fun getEq(side: Float): CustomShape {
        return Circle(side)
    }

    override fun getNotEq(height: Float, width: Float): CustomShape {
        return Ellipse(height, width)
    }
}