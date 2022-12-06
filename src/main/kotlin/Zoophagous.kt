/*
Плотоядные или зоофаги - животные, питающиеся преимущественно мясом.
Отсутствует амилаза — фермент, содержащийся в слюне, способствующий
расщеплению пищи растительного происхождения в процессе жевания.
*/

class Zoophagous(id: Int, name: String, maxSpeed: Int) : Animals(id, name, maxSpeed) {

    fun nameUpper(): String {
        return name.uppercase()
    }

}
//