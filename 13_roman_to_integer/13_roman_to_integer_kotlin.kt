fun main() {

    print(romanToInt("MCMXCIV")) //testCase
}

fun romanToInt(s: String): Int {
    var sum: Int = 0
    for (i in 0..s.length - 1) {
        sum += when {
            i == s.length - 1 -> romanValue(s[i])
            romanValue(s[i]) > romanValue(s[i + 1]) -> romanValue(s[i])
            romanValue(s[i]) < romanValue(s[i + 1]) -> -romanValue(s[i])
            else -> romanValue(s[i])
        }
    }
    return sum
}

fun romanValue(c: Char): Int {
    return when (c) {
        'I', 'i' -> 1
        'V', 'v' -> 5
        'X', 'x' -> 10
        'L', 'l' -> 50
        'C', 'c' -> 100
        'D', 'd' -> 500
        'M', 'm' -> 1000
        else -> 0
    }
}