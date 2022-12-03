fun main(){
    println("Qual o nome do jogador?:")
    var nome:String = readln()

    println("Quantos Gols ele fez?:")
    var Gols:Float = readLine()!!.toFloat()

    println("Quantas partidas ele fez?:")
    var partidas: Int = readLine()!!.toInt()

    println("A media de gols do $nome e de ${Gols/partidas} gols por partida")
}