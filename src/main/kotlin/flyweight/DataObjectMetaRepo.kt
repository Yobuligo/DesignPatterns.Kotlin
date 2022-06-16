package flyweight

import kotlin.reflect.KClass

object DataObjectMetaRepo : IDataObjectMetaRepo {
    private val dataObjectMetas = hashMapOf<KClass<out IDataObject>, IDataObjectMeta>()

    override fun fetch(type: KClass<out IDataObject>): IDataObjectMeta {
        val dataObjectMeta = dataObjectMetas[type]
        if (dataObjectMeta != null) {
            return dataObjectMeta
        }
        return addAndReturn(type)
    }

    private fun addAndReturn(type: KClass<out IDataObject>): IDataObjectMeta {
        return DataObjectMeta(type.simpleName.toString(), type).apply {
            dataObjectMetas[type] = this
        }
    }
}