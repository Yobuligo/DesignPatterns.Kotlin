package flyweight

import kotlin.reflect.KClass

interface IDataObjectMeta {
    val name: String
    val type: KClass<out IDataObject>
}