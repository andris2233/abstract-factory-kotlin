import shape.CustomShape
import shape.Rectangle
import shape.Square

class RectShapeFactory: ShapeFactory {
    override fun getEq(side: Float): CustomShape {
        return Square(side)
    }

    override fun getNotEq(height: Float, width: Float): CustomShape {
        return  Rectangle(height, width)
    }
}