//Класс междугородий автобус
class IntercityBus(override var brand: String, override var year: Int,
                   override var routeNumber: Int, override var seats: Int,
                   var startPoint: String, var endPoint: String): Bus {
    override fun getBusInfo(): String {
        return ("(Междугородний) Марка: \"$brand\", Год выпуска: $year, Номер маршрута $routeNumber, Количество мест: $year, Откуда: $startPoint, Куда: $endPoint")
    }
}