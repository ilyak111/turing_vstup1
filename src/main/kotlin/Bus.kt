//Интерфейс автобус
interface Bus {
    var brand: String //Марка
    var year: Int //Год выпуска
    var routeNumber: Int //Номер маршрута
    var seats: Int //Количество мест
    fun getBusInfo(): String //Метод получения информации об автобусе
}