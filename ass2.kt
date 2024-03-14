fun main (){
    var a:Int = 67
    var b:Int = 89
    var c:Int = 50

    var maximum:Int = maxOf(a,b,c)
    println("$maximum")
    if(a>b && a>c){
        println("maximum is $a")}
    else if (b>a && b>c){println("maximum is $b")}
        else{println("maximum is $c") }



}