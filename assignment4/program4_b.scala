class A1
{
private var a:Int=34
def display1()
{
a+=35
println("Inside class with variable having private access modifier!!")
println("Value is "+a)
}
}

class B1
{
protected var b:Float=35.5F
def display2()
{
println("Data inside this class is "+b)
}
}

class B2 extends B1
{
def display3()
{
b+=34.5F
println("Inside B2 which is sub-class of class B1")
println("Data inside this class is "+b)
}
}

class C
{
var c:Int=32
def display4()
{
c+=24
println("Data is "+c)
}
}
object program4_b extends App
{
var obj1=new A1()
obj1.display1()
var obj2=new B1()
obj2.display2()
var obj3=new B2()
obj3.display3()
var obj4=new C()
obj4.display4()
}