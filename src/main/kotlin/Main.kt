fun main() {
    val cityBus1 = CityBus("ПАЗ", 1990, 15, 16, 10) //Городской автобус 1
    println("Городской автобус 1: " + cityBus1.getBusInfo()) //Вывести его информацию

    println()

    val intercityBus1 = IntercityBus("Ford", 2000, 543, 14, "Москва", "Калуга") //Междугородний автобус 1
    println("Междугородний автобус 1: " + intercityBus1.getBusInfo()) //Вывести его информацию

    println()

    val busPark = BusPark(cityBus1, intercityBus1) //Создать автобусный парк с городским автобусом 1 и междугородним автобусом 1

    println()

    val cityBus2 = CityBus("Камаз", 2012, 32, 20, 5) //Городской автобус 2
    val intercityBus2 = IntercityBus("Лиаз", 1980, 979, 20, "Челябинск", "Екатеринбург") //Междугородний автобус 2
    busPark.addBus(cityBus2) //Добавить в автопарк городской автобус 2
    busPark.removeBus(intercityBus2) //Убрать из автопарка междугородний автобус 2 (Его там нет)

    println()

    busPark.printParkBuses() //Вывести информацию об автобусах автопарка

    println()

    busPark.removeBus(cityBus1) //Убрать из автопарка городской автобус 1 (Он есть)
    busPark.addBus(intercityBus2) //Добавить в автопарк междугородний автобус 2

    println()

    busPark.printParkBuses() //Вывести информацию об автобусах автопарка
}