object program5
{
	def arthmetic(a:Int,b:Int):Unit=
	{
	println("The following arthmetic operations are ")
	println(a+"+"+b+" is "+(a+b))
	println(a+"-"+b+" is "+(a-b))
	println(a+"/"+b+" is "+(a/b))
	println(a+"*"+b+" is "+(a*b))
	println(a+"%"+b+" is "+(a%b))
	}

	def relation(a:Int,b:Int):Unit=
	{
	println("The following relational operations are ")
	println("Is "+a+" equal to "+b+" ? : "+(a==b))
	println("Is "+a+" greater than "+b+" ? : "+(a>b))
	println("Is "+a+" less than "+b+" ? : "+(a<b))
	println("Is "+a+" greater than or equal to "+b+" ? : "+(a>=b))
	println("Is "+a+" less than or equal to "+b+" ? : "+(a<=b))
	println("Is "+a+" not equal to "+b+" ? : "+(a!=b))
	}	 

	def logic(c:Boolean,d:Boolean):Unit=
	{
	println("Logical operators return boolean values !!")
	println(c+" &&(Logical AND) "+d+" gives : "+(c&&d))
	println(c+" ||(Logical OR) "+d+" gives : "+(c||d))
	println(c+" !(Logical NOT) of &&(Logical AND) "+d+" gives : "+(!(c&&d)))
	println(c+" !(Logical NOT) of ||(Logical OR) "+d+" gives : "+(!(c||d)))
	}
	
	def bitwise(a:Int,b:Int):Unit=
	{
	println("The bitwise operations are ")
	println(a+" &(bitwise AND) "+b+" gives "+(a&b))
	println(a+" |(bitwise OR) "+b+" gives "+(a|b))
	println(a+" ^(EX-OR) "+b+" gives "+(a^b))
	println("1's compliment of "+a+" is "+(~a))
	println("Bitwise left shift of "+a+" is "+(a<<1))
	println("Right shift bitwise of "+b+" is "+(b>>>1))
	}

	def assign(a:Int,b:Int):Unit=
	{
	println("These are the short-hand assignment operators ")
	var c=0
	c+=a
	println("+=a is "+c)
	c-=b
	println("-=b is "+c)
	c/=a
	println("/=a is "+c)
	c*=a
	println("*=a is "+c)
	}
def main(args:Array[String]):Unit=
	{	
	println("Enter any two integers for various scala operations ")
	var a=scala.io.StdIn.readInt()
	var b=scala.io.StdIn.readInt()
	var c=true
	var d=false
	arthmetic(a,b)
	println("*************************************")
	relation(a,b)
	println("*************************************")
	logic(c,d)
	println("*************************************")
	bitwise(a,b)
	println("*************************************")
	assign(a,b)
	println("*************************************")
	}
}