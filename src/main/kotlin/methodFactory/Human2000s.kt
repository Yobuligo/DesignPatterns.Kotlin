package methodFactory

class Human2000s : Human() {
    override fun createGadget(): IGadget {
        return MobilePhone()
    }
}