package flyweight

import kotlin.reflect.KClass

class DataObjectMeta(override val name: String, override val type: KClass<out IDataObject>) : IDataObjectMeta