import shape.CustomShape

interface ShapeFactory {
    fun getEq(side: Float): CustomShape
    fun getNotEq(height: Float, width: Float): CustomShape
}