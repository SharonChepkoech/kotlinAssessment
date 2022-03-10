//1. Given a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string
fun main(){
    var word= "codeHive"
    var letters = word[4].toString()+word[5]+word[6]+word[7]
    println(letters)

modulus(11,7)
    printName("Cheko","12 ")
    findLength()
}
//2. Create and invoke a function that given two numbers returns the
//remainder of their division
fun modulus(a:Int,b:Int):Int{
    var c=a%b
    println(c)
    return c
}
//3. Write a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively.
fun printName(name:String,age:String):String{
    val s=("Hi, my name is $name and I am $age years old.")
    println(s)
    return s
}
// 4. Write a function that takes in a string and returns its length
fun findLength(){
    var f="watermelon"
    var p =(f.length)
    println(p)
}