fun main() {
    println(potencia(2,3))

}
fun potencia (num: Int,exp:Int):Int{
    if (exp ==0) {
        return 1;
    }else if (exp==1) {
        return num;
    }else{
        return num*potencia(num,exp-1);
    }
}