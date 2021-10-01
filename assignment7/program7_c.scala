object program7_c
{
	def entry_control()={
	var i=0
	while(i<=10)
	{
	print(i+",")
	i+=1
	}
	println()
	var j=1
	for(j<-1 until 10)
	{
	print(j+",")
	}
	println()
	}
	
	def exit_control()={
	var i=0
	do
	{
	print(i+",")
	i+=1
	}while(i<=10);
	}

	def main(args:Array[String]):Unit={
	entry_control()
	exit_control()
	}
}