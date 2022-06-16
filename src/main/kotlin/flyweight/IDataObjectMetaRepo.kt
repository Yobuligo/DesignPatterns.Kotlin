package flyweight

import kotlin.reflect.KClass

interface IDataObjectMetaRepo {
    fun fetch(type: KClass<out IDataObject>): IDataObjectMeta
}