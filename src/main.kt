fun main (args: Array<String>)
{
    var text = args
    if (text.isNotEmpty()) {
        print("yourapp ")
        for (word in text) {
            print("$word ")
        }
    }
    else {
        print("Enter your sentence: ")
        val sentence = readLine()
        text = sentence?.split(" ")!!.toTypedArray()
        print("echo ")
        for (word in text) {
            print("$word ")
        }
        print("| yourapp")
    }

    val textMap = numberOfMention(text)

    val comparatorValue = compareByDescending<Pair<String, Int>> {it.second}
    val comparatorKey = comparatorValue.thenBy {it.first}
    val textMapSorted = textMap.toList().sortedWith(comparatorKey).toMap()

    println("\nText contains ${text.size} words \nTOP10")

    var i = 0
    for (word in textMapSorted) {
        println("${word.value} - ${word.key}")
        i++
        if (i==10) break
    }
}

fun numberOfMention (text: Array<String>): MutableMap<String, Int>
{
    var count: Int?
    val textMap: MutableMap<String, Int> = mutableMapOf()

    for (word in text) {
        count = textMap[word]
        if (count == null ) {
            count = 0
        }
        textMap[word] = count+1
    }

    return textMap
}
