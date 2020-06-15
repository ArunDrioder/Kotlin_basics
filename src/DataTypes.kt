fun main (args : Array<String>)


{
    val printValueObj = PrintValue()
    printValueObj.name = "My Sample String"
    printValueObj.printConsole()
}
class PrintValue
{
    var name :String = ""

     fun printConsole()

    {
    println(name)

    }

}