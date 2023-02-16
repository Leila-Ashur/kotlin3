fun main() {
    name()

    var result=greeting("leila",20)
    println(result)
    myname("leila")

}
fun name() {
    var school ="AkiraChix"
    println("${school[0]}${school[2]}${school[3]}")

}
fun greeting(X: String,y: Int): String {
    var names = "hy, my name is $X and i am $y years old"
    return names

}
fun legnth(name:String):Int{


var range=name.length
        return range
}




fun myname(name: String){
    if(name=="leila"){
        println("thats me")}
    else{
        println("I dont know who that is")}
}
