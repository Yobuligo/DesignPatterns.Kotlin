package builder

class NotebookTester {
    fun test(notebook: INotebook) {
        println("Notebook with:")
        println("Mainboard: ${notebook.mainBoard.name}")
        println("CPU: ${notebook.cpu.name}")
        println("RAM: ${notebook.ram.name}")
        println("Storage: ${notebook.storage.name}")
        println("Graphic Card: ${notebook.graphicCard.name}")
    }
}