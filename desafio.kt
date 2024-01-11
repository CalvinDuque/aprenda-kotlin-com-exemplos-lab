enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class Conteudo(var nome: String, var duração: Int = 0) {
    override fun toString(): String {
        return "Conteudo(nome='$nome', duração=$duração)"
    }
}

data class Formacao(val nome: String, var conteudos: List<Conteudo>) {

    val inscritos = mutableListOf<Usuario>() 
   	

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("A matrícula de ${usuario.nome} foi realizada com sucesso, em $nome.\n")
    }

override fun toString(): String {
     val conteudosString = conteudos.joinToString(separator = "\n") { it.toString() }
     val inscritosString = inscritos.joinToString(", ") { it.nome }
     return "'$nome'\nConteúdos:\n$conteudosString\nInscritos: $inscritosString\n"
    }
}

fun main() {
    val kotlinBasico = Conteudo("Kotlin Básico", 60)
    val kotlinIntermediario = Conteudo("Kotlin Intermediário", 120)
    val kotlinAvancado = Conteudo("Kotlin Avançado", 180)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinIntermediario, kotlinAvancado))

    val usuario1 = Usuario("Maria Cristina")
    val usuario2 = Usuario("Calvin Duque")
    val usuario3 = Usuario("FalvoJr")

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)

    println("Detalhes da formação:\n$formacaoKotlin")
}
