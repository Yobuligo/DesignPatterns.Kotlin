package builder

data class Notebook(
    override val mainBoard: IMainBoard,
    override val cpu: ICPU,
    override val ram: IRAM,
    override val storage: IStorage,
    override val graphicCard: IGraphicCard
) : INotebook