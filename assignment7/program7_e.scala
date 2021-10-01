object program7_e
{
def main(args:Array[String]):Unit={
var n=scala.io.StdIn.readInt()
println("Enter the elements...")
var z:Array[Int]=new Array[Int](n)
var i=0
for(i<-0 until z.length)
{
z(i)=scala.io.StdIn.readInt()
}
println("Array is ...")
var j=0
var k=0
var large=0
for(j<-0 until z.length)
{
	for(k<-j until z.length)
	{
	var temp=0 
	if(z(k)<=z(j))
	  {
	   temp=z(k)
	   z(k)=z(j)
	   z(j)=temp
	  }
	} 
}
var l=0
println("Minimum element is "+z(l))
}
}
