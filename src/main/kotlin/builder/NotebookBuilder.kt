package builder

class NotebookBuilder : INotebookBuilder {
    private var mainBoard: IMainBoard = MSIGaming()
    private var cpu: ICPU = AMDRyzen()
    private var ram: IRAM = Crucial16GB()
    private var storage: IStorage = Samsung1TB()
    private var graphicCard: IGraphicCard = GeforceRTX3070()

    override fun setMainBoard(mainBoard: IMainBoard): INotebookBuilder {
        this.mainBoard = mainBoard
        return this
    }

    override fun setCPU(cpu: ICPU): INotebookBuilder {
        this.cpu = cpu
        return this
    }

    override fun setRAM(ram: IRAM): INotebookBuilder {
        this.ram = ram
        return this
    }

    override fun setStorage(storage: IStorage): INotebookBuilder {
        this.storage = storage
        return this
    }

    override fun setGraphicCard(graphicCard: IGraphicCard): INotebookBuilder {
        this.graphicCard = graphicCard
        return this
    }

    override fun build(): INotebook {
        return Notebook(mainBoard, cpu, ram, storage, graphicCard)
    }
}