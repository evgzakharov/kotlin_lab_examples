package test

fun concatToString(values: List<String>, delimiter: String = ",", prefix: String = "", suffix: String = ""): String {
    return prefix + values.joinToString(separator = delimiter) + suffix
}
