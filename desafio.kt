//Niveis dos cursos da DIO
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)
//Conteudo do curso da DIO
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
    // Criação de instâncias de Conteudo
    val kotlinBasico = Conteudo("Kotlin Básico", 60)
    val kotlinIntermediario = Conteudo("Kotlin Intermediário", 120)
    val kotlinAvancado = Conteudo("Kotlin Avançado", 180)
	// Criação de uma instância de Formacao
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinIntermediario, kotlinAvancado))
	// Criação de instâncias de Usuario
    val usuario1 = Usuario("Maria Cristina")
    val usuario2 = Usuario("Calvin Duque")
    val usuario3 = Usuario("FalvoJr")
	// Matrícula de usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)
	// Impressão dos detalhes da formação
    println("Detalhes da formação:\n$formacaoKotlin")
}