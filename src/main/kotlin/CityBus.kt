//Класс городской автобус
class CityBus(override var brand: String, override var year: Int,
              override var routeNumber: Int, override var seats: Int,
              var interval: Int): Bus { //interval - интервал, с которым ходит автобус
    override fun getBusInfo(): String {
        return ("(Городской) Марка: \"$brand\", Год выпуска: $year, Номер маршрута $routeNumber, Количество мест: $year, Интервал: $interval")
    }
}