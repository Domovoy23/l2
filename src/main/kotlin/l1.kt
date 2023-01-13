import java.util.*


    fun main() {

        var str: Int = Scanner(System.`in`).nextInt()
        var colc: Int = 0
        if(str>0){
            for (i in 0..str) {
                colc+=i

        }}
        else{
            for (i in str..0) {
                colc+=i

            }

        }

        println(colc)
    }


