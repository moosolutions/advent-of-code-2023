package aoc.day1

class Trebuchet(private var calibrationValues: List<String>) {

    fun calibrationValuesSum(): Int
    {
        var sum = 0;
        calibrationValues.forEach {
            val digits = it.filter {
                c: Char -> c.isDigit()
            }

            var digit = digits.first().toString() + digits.last().toString()
            if (digit.length == 1) {
                digit += digit
            }
            sum += digit.toInt();
        }
        return sum;
    }

    fun realCalibrationValuesSum(): Int
    {
        val digits = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        calibrationValues = calibrationValues.map {it ->
            digits.foldIndexed(it) { idx, acc, curr -> acc.replace(curr, curr.first().toString() + (idx + 1).toString() + curr.last())
            }
        }

        return calibrationValuesSum();
    }

}