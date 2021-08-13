object calci
{
def addition(a:Int,b:Int):Int={
	var sum:Int=0
	sum=a+b
	return sum
}

def subtract(a:Int,b:Int):Int={
	var diff:Int=0
	if(a>b)
	{
		diff=a-b
	}
	else
	{
		diff=b-a
	}
	return diff
}

def divide(a:Int,b:Int):Int={
	var div:Int=0
	if(a>b)
	{
		div=a/b
	}
	else if(b>a)
	{
		div=b/a
	}
	else
	{
		div=0
	}
	return div
}
def multiply(a:Int,b:Int):Int={
	var pro:Int=1
	pro=a*b
	return pro
}

def main(arg:Array[String]):Unit=
{
println("Enter any two numbers")
var a=scala.io.StdIn.readInt()
var b=scala.io.StdIn.readInt()
println("1 for addition\n2 for subtraction\n3 for division\n4 for multiplication")
var choice=scala.io.StdIn.readInt()
if(choice==1)
{
println("Value after addition is ", addition(a,b))
}
else if(choice==2)
{
println("Value after subtracting is ", subtract(a,b))
}
else if(choice==3)
{
println("Value after division is ", divide(a,b))
}
else
{
println("Value after multiplication is ", multiply(a,b))
}
}
}