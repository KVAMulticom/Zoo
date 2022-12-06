/*
Травоядность — питание животных растительной пищей.
Фитофаги являются так называемыми первичными потребителями.
Из пищеварительных ферментов у них преобладают амилазы.
*/

class Phytophagous(id: Int, name: String, maxSpeed: Int, eatMethod: String = "Травоядное") : Animals(id, name, maxSpeed){

    fun nameUpper(): String {
        return name.uppercase()
    }

}
//