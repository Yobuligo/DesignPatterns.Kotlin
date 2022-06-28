class TypeWriter(val text: String){
    fun print(){
        repeat(text.length){
            if (text[it] == '\n'){
                print("${text[it]}")
            }else{
                print("${text[it]} ")
            }
            Thread.sleep(300)
        }
    }
}

fun main() {
    println()
    TypeWriter("Abendplanung!\n1. Wir machen uns jetzt erst einmal einen Gemütlichkeits-Mochito?\n2. Wir heizen den Schornstein an\n3. Wir trinken einen Schluck vom Gemütlichkeits-Mochito\n4. Wir hauen die Steaks aufs Rost\n5. Spachteln").print()
}