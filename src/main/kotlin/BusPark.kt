//Класс автобусный парк
class BusPark(vararg buses: Bus) {
    private val busPark: MutableList<Bus> = mutableListOf()
    init { //Вызываем метод добавления автобуса в автопарк для всех автобусов из конструктора
        println("Автопарк был создан!")
        buses.forEach{addBus(it)}
    }
    fun addBus(busToAdd: Bus) { //Добавить автобус в автопарк
        busPark.add(busToAdd)
        println("В автопарк добавлен новый автобус: " + busToAdd.getBusInfo())
    }
    fun removeBus(busToRemove: Bus) { //Убрать автобус из автопарка
        if (busToRemove in busPark) { //Если этот автобус есть в автопарке
            busPark.remove(busToRemove)
            println("Из автопарка был убран автобус: " + busToRemove.getBusInfo())
        }
        else //Если его нет
            println("Такого автобуса нет в автопарке!")
    }
    fun printParkBuses() { //Вывести информацию о всех автобусах автопарка
        if (busPark.isNotEmpty()) //Если автопарк не пуст
            busPark.forEachIndexed{number, bus -> println("Автобус ${number + 1}: " + bus.getBusInfo())}
        else //Если пуст
            println("Автопарк пуст!")
    }
}