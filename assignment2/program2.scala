object program2
{
	def dTypE(variable:AnyVal):AnyVal=
	{
		println("Parent class AnyVal invoked!!")
		println(variable.getClass.getSimpleName+" entered")
		println("Data entered is "+variable)
		println("**************************")
	}

	def unitcheck(variable1:AnyVal):Unit=
	{
		println("Data entered is "+variable1)
	}
	def dTypE1(variable1:Any):Any=
	{
		println("superclass Any invoked!!")
		println("Data entered is "+variable1)
		println("**************************")
	}

	def main(args:Array[String]):Unit={
		println("Enter the datatypes you want to check...")
		println("1 for Byte\n2 for Integer\n3 for Float\n4 for Double\n5 for character\n6 for Long\n7 for Boolean\n8 for Short\n")
		var c=scala.io.StdIn.readInt()
		if(c==1)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readByte()
			if(a>=java.lang.Byte.MIN_VALUE && a<=java.lang.Byte.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==2)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readInt()
			if(a>=java.lang.Integer.MIN_VALUE && a<=java.lang.Integer.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==3)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readFloat()
			if(a>=java.lang.Float.MIN_VALUE && a<=java.lang.Float.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==4)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readDouble()
			if(a>=java.lang.Double.MIN_VALUE && a<=java.lang.Double.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==5)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readChar()
			if(a>=java.lang.Character.MIN_VALUE && a<=java.lang.Character.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==6)
		{
			println("Enter any value")
			var a=scala.io.StdIn.readLong()
			if(a>=java.lang.Long.MIN_VALUE && a<=java.lang.Long.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		else if(c==7)
		{
			println("Enter either true or false for boolean")
			var a=scala.io.StdIn.readBoolean()
			dTypE(a)
		}
		else
		{
			println("Enter any value")
			var a=scala.io.StdIn.readShort()
			if(a>=java.lang.Short.MIN_VALUE && a<=java.lang.Short.MAX_VALUE)
			{
			dTypE(a)}
			else
			{
			println("Out of range!!")}
		}
		println("Enter any string")
		var st=scala.io.StdIn.readLine()
		println("Data entered is "+st+" and the datatype is "+st.getClass.getSimpleName)
		println("Enter any data for checking unit data type in scala")
		var cg=scala.io.StdIn.readInt()
		var f=unitcheck(cg)
		println("Value returned is "+f)
		println("**************************")
		dTypE1(23)
		dTypE1(List(1,2,3,4))
}
} 