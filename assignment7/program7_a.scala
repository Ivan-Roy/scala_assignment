object program7_a
{
def maxmin(a:Int,b:Int)={
	def max()={
	if(a>b)
	{
		println(a+" is greater than "+b)
	}
	else
	{
		println(b+" is greater than "+a)
	}
	}
	def min()={
	if(a<b)
	{
		println(a+ " is smaller than "+b)
	}
	else
	{
		println(b+ " is smaller than "+a)
	}
	}
max()
min()
}
def main(args:Array[String]):Unit={
var a=scala.io.StdIn.readInt()
var b=scala.io.StdIn.readInt()
maxmin(a,b)
}
}
