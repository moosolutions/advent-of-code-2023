package aoc.day2

class CubeConundrumGame(private var games: List<String>) {
    fun getGameIdSum(powerSum: Boolean): Int
    {
        var sum = 0
        var power = 0
        games.forEach {
            val game = it.split(':');
            val id = game[0].replace("Game ", "").toInt();
            val sets = game[1].split(';')
            var impossible = false

            var red = 0
            var green = 0
            var blue = 0
            sets.forEach {
                it
                    .split(',')
                    .forEach {
                        val (value, color) = it.split(' ').filter { it.isNotEmpty() }
                        if (color == "blue" && value.toInt() > 14) {
                            impossible = true
                        } else if (color == "red" && value.toInt() > 12) {
                            impossible = true
                        } else if (color == "green" && value.toInt() > 13) {
                            impossible = true
                        }

                        if (color == "blue" && value.toInt() > blue) {
                            blue = value.toInt()
                        } else if (color == "red" && value.toInt() > red) {
                            red = value.toInt()
                        } else if (color == "green" && value.toInt() > green) {
                            green = value.toInt()
                        }
                    }
            }
            power += (red * blue * green)

            if (!impossible) {
                sum += id
            }
        }

        if (powerSum) {
            return power
        }
        return sum
    }
}
