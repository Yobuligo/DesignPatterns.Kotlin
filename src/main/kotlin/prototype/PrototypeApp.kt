package prototype

/**
 * To clone objects which:
 * - takes a lot of time to load (e.g. because of pictures or textures)
 * - are every complex and may contain of a lot of other objects
 * - is required to copy private attributes which cannot be copied or set from outside the object
 */
fun main() {
    val maxNumberCloneOperations = 3
    val cellTester = CellTester()
    val cellCloner = CellCloner()

    // Create cell which can be cloned only [maxNumberCloneOperations] times
    val cell = Cell(
        "Skin Cell",
        Nucleolus("Nucleolus"),
        CellMembrane("CellMembrane"),
        Mitochondria("Mitochondria"),
        maxNumberCloneOperations
    )

    val newCell = cell.clone()
    newCell.nucleolus.name = "Nucleolus Cell 2"
    newCell.cellMembrane.name = "Cell Membran Cell 2"
    newCell.mitochondria.name = "Mitochondria Cell 2"

    cellTester.test(cell)
    cellTester.test(newCell)

    cellCloner.cloneEndless(cell)
    cellCloner.cloneEndless(newCell)
}