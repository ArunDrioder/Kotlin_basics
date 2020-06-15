fun main (args : Array<String>)
{
    val name : String
    name = "Arunprasadh"

    val printValueObj = PrintValue();

    printValueObj.printConsole(name)


}
class PrintValue
{
    fun printConsole(name : String)
{
    println(name)
}

}