package prototype

class CellTester {
    fun test(cell: ICell) {
        println("Cell has Nucleolus named '${cell.nucleolus.name}', Mitochondria named '${cell.mitochondria.name}', Cell membran named '${cell.cellMembrane.name}'")
    }
}