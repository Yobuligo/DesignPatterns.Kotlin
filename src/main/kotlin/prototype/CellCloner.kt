package prototype

class CellCloner {
    fun cloneEndless(cell: ICell) {
        try {
            while (true) {
                cell.clone()
            }
        } catch (e: CellCloneException) {
            println(e.message)
        }
    }
}