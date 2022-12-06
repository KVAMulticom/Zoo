// Уважаемые слушатели!
//
// В рамках задания вам необходимо проделать работу с классами
//
// Инструкция:
//
// Шаг 1. Открыть среду разработки Android Studio
//
// Шаг 2. Создать новый проект
//
// Шаг 3. Создать классы для травоядных и плотоядных животных
//
// Шаг 4. Каждому присвоить некоторые уникальные поля
//
// Шаг 5. Поместить 2 травоядных и 2 плотоядных в список
//
// Шаг 6. Вывести список на экран
//
// Шаг 7. Загрузить исходный код в репозиторий на платформе GitHub
//
// Шаг 8. Выложить ссылку в Odin

fun main(args: Array<String>) {


    val phytophagous1 = Phytophagous(id = 0, name = "Слон", maxSpeed = 50, eatMethod = "Травоядное")
    val phytophagous2 = Phytophagous(id = 1, name = "Жираф", maxSpeed = 45, eatMethod = "Травоядное")
    val zoophagous1 = Zoophagous(id = 2, name = "Гепард", maxSpeed = 120)
    val zoophagous2 = Zoophagous(id = 3, name = "Гиена", maxSpeed = 60)
    val msString: String = " - Максимальная скорость: "

    println (phytophagous1.nameUpper() + msString + phytophagous1.maxSpeed + " км/час")
    println (phytophagous2.nameUpper() + msString + phytophagous2.maxSpeed + " км/час")
    println (zoophagous1.nameUpper() + msString + zoophagous1.maxSpeed + " км/час")
    println (zoophagous2.nameUpper() + msString + zoophagous2.maxSpeed + " км/час")

    var ZooSpisok = mutableListOf<String>()
    var Spisok_tr = herbivores()
    var Spisok_cr = carnivorous()
    for (i in Spisok_tr.name) {
        ZooSpisok.add(i)}

    for (i in Spisok_cr.name) {
        ZooSpisok.add(i)}
    println ("Список травоядных и плотоядные животных нашего зоопитомника:")
    println (ZooSpisok)
}

class herbivores{
    val name = listOf<String> ("Слон - Тоди", "Олень - Маркиз")
}
class carnivorous {
    val name = listOf<String> ("Тигр - Гендольф", "Медведь - Харза")

}
//