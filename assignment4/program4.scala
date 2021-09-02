object program4
{
def input()
{
println("Enter any text ")
var s=scala.io.StdIn.readLine()
println("Text entered is "+s)
}

def mutable(x:Int,y:Int):Unit=
{
println("Addition is "+(x+y))
}

def main(args:Array[String]):Unit=
{
input()
println("Enter the initial values ")
var a=scala.io.StdIn.readInt()
var b=scala.io.StdIn.readInt()
println("Enter the updated values ")
a=scala.io.StdIn.readInt()
b=scala.io.StdIn.readInt()
println("Enter the immutable values ")
val c=scala.io.StdIn.readInt()
val d=scala.io.StdIn.readInt()
mutable(a,b)
println("Addition of immutable values are "+(c+d))
}
}
