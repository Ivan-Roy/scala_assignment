object program7_b
{
def maxmin(a:Int,b:Int)={
	max()
	def max()={
	if(a>b)
	{
	println(a+" is greater than "+b)
	}
	else
	{
	println(b+" is greater than " +a)
	}
	min()
	def min()={
	if(a<b)
	{
	println(a+" is smaller than "+b)
	}
	else
	{
	println(b+" is smaller than "+a)
	}
	}
	}
}
def main(args:Array[String]):Unit={
var a=scala.io.StdIn.readInt()
var b=scala.io.StdIn.readInt()
maxmin(a,b)
}
}