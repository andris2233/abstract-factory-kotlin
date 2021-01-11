package shape

import kotlin.math.pow

class Circle (private var radius: Float) : CustomShape {
    override fun getArea(): Float {
        return radius.pow(2) * Math.PI.toFloat()
    }

    override fun getShapeType(): String {
        return "circle"
    }
}