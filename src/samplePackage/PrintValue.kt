package samplePackage
class PrintValue( var name: String)//----> for creating constructor, we need to create the constructor in the same place where we're declaring the class.
{
    fun printConsole()
    {
        println("The name is : ${name}")
    }
}