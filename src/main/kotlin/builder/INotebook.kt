package builder

interface INotebook {
    val mainBoard: IMainBoard
    val cpu: ICPU
    val ram: IRAM
    val storage: IStorage
    val graphicCard: IGraphicCard
}