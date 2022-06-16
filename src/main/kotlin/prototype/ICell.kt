package prototype

interface ICell : ICloneable<ICell> {
    val name: String
    val nucleolus: INucleolus
    val cellMembrane: ICellMembrane
    val mitochondria: IMitochondria
    val numberCloneOperations: Int
    val maxNumberCloneOperations: Int
}