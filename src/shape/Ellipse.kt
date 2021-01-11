package shape

class Ellipse (private var radiusA: Float, private var radiusB: Float): CustomShape {
    override fun getArea(): Float {
        return radiusA * radiusB * Math.PI.toFloat()
    }

    override fun getShapeType(): String {
        return "ellipse"
    }
}