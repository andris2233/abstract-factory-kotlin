package shape

class Square (private var side: Float): CustomShape {

    override fun getArea(): Float {
        return side * side
    }

    override fun getShapeType(): String {
        return "square"
    }
}