fun main() {
    val strs: Array<String> = arrayOf("a") // testCase
    print(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var tempList = mutableListOf<String>()
    var commonList = mutableListOf<String>()
    for (str in strs) {

        for (j in strs[0].length downTo 0) {
            when {
                str.startsWith(strs[0].substring(0, j)) -> tempList.add(strs[0].substring(0, j))
            }
        }
        commonList.add(tempList.max() ?: "")
        tempList.removeAll(tempList)
    }
    return commonList.min() ?: ""
}
