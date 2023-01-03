//[Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
//Desafio De Projeto Do Lindolfo Luiz 

enum class Nivel {
    ESTÁGIARIO,
    JUNIOR,
    PLENO
}

data class Usuario(val nomeUsuario: String, val matriculaUsuario: String) {
    override fun toString(): String {
        return "$nomeUsuario (matrícula $matriculaUsuario)"
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 100) {
    override fun toString(): String {
        return "$nome (Duração: $duracao)"
    }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)
    }

    override fun toString(): String {
        //return "Formação: $nome\nConteúdo educacional: $conteudos\nNível: $nivel\nAlunos
        //inscritos na formação: $inscritos"
        return """
        Formação: $nome
        Conteúdo educacional: $conteudos
        Duração do conteúdo: 
        Nível: $nivel
        Alunos inscritos na Formação: $inscritos
        """.trimIndent()
    }
}

fun generateMatricula(): String {
    return (100..500).random().toString()
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de
    //evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em
    //questão.")
    //
    //
    val lindolfo = Usuario("Lindolfo", generateMatricula())
    val juliana = Usuario("Juliana", generateMatricula())
    val karoline = Usuario("Karoline", generateMatricula())
    val fernanda = Usuario("Fernanda", generateMatricula())
    val iacopo = Usuario("Iacopo", generateMatricula())
    val luiz = Usuario("Luiz", generateMatricula())
    val marilene = Usuario("Marilene", generateMatricula())
    val conteudoEducacionalCostura = ConteudoEducacional("Costura", 45)
    val conteudoEducacionalAdministração = ConteudoEducacional("Formação Administração", 700)
    val conteudoEducacionalHabilitação = ConteudoEducacional("Taxista", 120)
    val conteudoEducacionalJava = ConteudoEducacional("Java", 300)
    val conteudoEducacionalEnfermeira = ConteudoEducacional("Formação Enfermagem", 400)
    val conteudoEducacionalScrumMaster = ConteudoEducacional("Scrum Master", 300)
    val conteudoEducacionalKotlin = ConteudoEducacional("Kotlin", 160)
    
    val formacaoJava =
            Formacao("Java Developer", listOf(conteudoEducacionalJava), Nivel.PLENO)
    val formacaoCostura =
            Formacao("Mestre em cortes", listOf(conteudoEducacionalCostura), Nivel.JUNIOR)
    val formacaoKotlin =
            Formacao("Formação Kotlin Developer", listOf(conteudoEducacionalKotlin), Nivel.ESTÁGIARIO)
    val formacaoAdministração =
            Formacao("Formação Administração", listOf(conteudoEducacionalAdministração),  Nivel.PLENO
    )
    val formacaoEnfermeira =
            Formacao("Formação Enfermagem", listOf(conteudoEducacionalEnfermeira),  Nivel.PLENO 
    )                 
    val formacaoHabilitação =
            Formacao("Taxista", listOf(conteudoEducacionalHabilitação),  Nivel.ESTÁGIARIO
    )                 
    val formacaoScrumMaster =
            Formacao("Scrum Master", listOf(conteudoEducacionalScrumMaster),  Nivel.PLENO                       
    )                
                     
            
    formacaoAdministração.matricular(karoline)        
    formacaoJava.matricular(lindolfo)
    formacaoEnfermeira.matricular(fernanda, juliana)
    formacaoKotlin.matricular(lindolfo)
    formacaoCostura.matricular(marilene)
    formacaoScrumMaster.matricular(iacopo)
    formacaoHabilitação.matricular(luiz)
    
    println(formacaoJava)
    println("\n----------------------------------------------------------\n")
    println(formacaoCostura)
    println("\n----------------------------------------------------------\n")
    println(formacaoKotlin)
    println("\n----------------------------------------------------------\n")
    println(formacaoAdministração)
    println("\n----------------------------------------------------------\n")
    println(formacaoEnfermeira)
    println("\n----------------------------------------------------------\n")
    println(formacaoHabilitação)
    println("\n----------------------------------------------------------\n")
    println(formacaoScrumMaster)
    println("\n----------------------------------------------------------\n")

}