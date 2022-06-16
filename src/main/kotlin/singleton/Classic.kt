package singleton

class Classic {
    companion object {
        private var instance: Classic? = null

        fun getInstance(): Classic {
            if (instance == null) {
                instance = Classic()
            }
            return instance!!
        }
    }

    fun doSomething() {
        println("Classical singleton was called.")
    }
}