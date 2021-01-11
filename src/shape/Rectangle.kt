package shape

class Rectangle (private var height: Float, private var width: Float): CustomShape {
    override fun getArea(): Float {
        return height * width;
    }

    override fun getShapeType(): String {
        return "rectangle";
    }
}