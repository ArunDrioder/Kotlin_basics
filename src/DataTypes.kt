import samplePackage.PrintValue

fun main (args : Array<String>)


{
//    val printValueObj = PrintValue()
//    printValueObj.name = "My Sample String"
//    println("The name Given is :" +printValueObj.name)//--> This is 1 method
//    println("The name Given is : ${printValueObj.name}")//-->This is another method., This method is just to let the compiler to understand
//    // that we need to extract the value from the class oject,so we're using $sign, this is called string interpolation.

    //The above lines are commented to call the constructor inside the sample package., the above lines are the types of the string interpolation.


    var printValueObj = PrintValue("Arunprasadh")
    printValueObj.printConsole();



}




