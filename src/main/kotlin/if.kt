import java.util.*

fun main(){
    println("Please enter your score :")
    var str: Long = Scanner(System.`in`).nextLong()
    while (str !in 0..100){
        println("Please enter your score again :")
        str = Scanner(System.`in`).nextLong()
    }

    if(str>=70){
        println("Congrats! You’ve passed the test!");
    }
    else{
        println("Sorry, you’ve failed the test.")
    }




}



