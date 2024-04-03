enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario


data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
      
        inscritos.add(usuario)
    }
}

fun main() {
   
    val usuario1 = Usuario()
    val conteudo1= ConteudoEducacional(nome = "Kotlin Basico", duracao = 120)
    val formacao1 = Formacao(nome = "Desenvolvedor Kotlin", conteudos = listOf(conteudo1))
	val usuario2 = Usuario()
    val conteudo2 = ConteudoEducacional(nome = "Java", duracao = 120)
    val formacao2 = Formacao(nome ="Desenvolvedor Java", conteudos = listOf(conteudo2))

	
    formacao1.matricular(usuario1)
   	formacao2.matricular(usuario2)
    
    println("Usuários inscritos na formação '${formacao1.nome}': ${formacao1.inscritos.size}")
    println("Usuários inscritos na formação '${formacao2.nome}': ${formacao2.inscritos.size}")
}