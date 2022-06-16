package builder

fun main() {
    val notebookTester = NotebookTester()
    notebookTester.test(NotebookBuilder().build())
    println()
    notebookTester.test(
        NotebookBuilder()
            .setCPU(IntelCore())
            .setGraphicCard(GeforceRTX3070())
            .setRAM(Crucial32GB())
            .setStorage(Samsung8TB())
            .build()
    )
}