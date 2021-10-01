import util.control._
object program7_d
{
	def break_continue()={
	var obj1=new Breaks()
	var b:Boolean=true
	obj1.breakable
	{
	while(b)
	{
	println("Enter any number ")
	var a=scala.io.StdIn.readInt()
		if (a==3)
		{
		println(a+" entered!!") 
		obj1.break
		}
	}
	}
	}
	
	def main(args:Array[String]):Unit=
	{
	break_continue()
	}
}