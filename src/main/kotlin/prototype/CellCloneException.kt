package prototype

class CellCloneException(cell: ICell) :
    RuntimeException("Error when cloning cell '${cell.name}'. Cell can only be cloned '${cell.maxNumberCloneOperations}' times.") {
}