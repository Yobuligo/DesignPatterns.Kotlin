package builder

interface INotebookBuilder {
    fun setMainBoard(mainBoard: IMainBoard): INotebookBuilder
    fun setCPU(cpu: ICPU): INotebookBuilder
    fun setRAM(ram: IRAM): INotebookBuilder
    fun setStorage(storage: IStorage): INotebookBuilder
    fun setGraphicCard(graphicCard: IGraphicCard): INotebookBuilder
    fun build(): INotebook
}