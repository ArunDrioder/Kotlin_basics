fun main (args : Array<String>)


{

    val printValueObj = PrintValue();
    printValueObj.name = "My Sample String"
    printValueObj.printConsole(printValueObj.name);
}
class PrintValue
{
    var name :String = "";

     fun printConsole(name : String)

    {
    println(name)

    }

}