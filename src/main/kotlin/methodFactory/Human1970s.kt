package methodFactory

class Human1970s : Human() {
    override fun createGadget(): IGadget {
        return BeerOpener()
    }
}