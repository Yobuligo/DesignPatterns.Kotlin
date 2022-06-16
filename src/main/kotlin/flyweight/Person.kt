package flyweight

class Person(val firstname: String, val lastname: String) : IDataObject {
    override val meta: IDataObjectMeta by lazy { DataObjectMetaRepo.fetch(this::class) }
}