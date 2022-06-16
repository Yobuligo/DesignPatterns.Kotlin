package flyweight

fun main() {
    var meta: IDataObjectMeta? = null
    repeat(10000) {
        val person = Person("Stacey", "Starfish")
        if (meta == null || meta != person.meta) {
            meta = person.meta
            println("Meta '${meta!!.name}' should be printed only once, as the meta information is equal for all created persons")
        }
    }
}