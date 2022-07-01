package prototype

class Cell(
    override val name: String,
    override val nucleolus: INucleolus,
    override val cellMembrane: ICellMembrane,
    override val mitochondria: IMitochondria,
    override val maxNumberCloneOperations: Int
) : ICell {
    private var _numberCloneOperations = 0

    override val numberCloneOperations: Int
        get() {
            return _numberCloneOperations
        }

    init {
        this._numberCloneOperations = numberCloneOperations
    }

    override fun clone(): ICell {
        if (_numberCloneOperations == maxNumberCloneOperations) {
            throw CellCloneException(this)
        }

        _numberCloneOperations++
        println("'$name' was cloned")
        return Cell(
            "$name$numberCloneOperations",
            Nucleolus(nucleolus.name),
            CellMembrane(cellMembrane.name),
            Mitochondria(mitochondria.name),
            maxNumberCloneOperations
        ).also {
            it._numberCloneOperations = _numberCloneOperations
        }
    }
}