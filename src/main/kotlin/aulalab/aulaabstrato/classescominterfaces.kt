package aulalab.aulaabstrato

fun main() {
    class Vendedor(
        var cnpj: String,
        var senha: String
    ) : UsuarioAutenticavel {
        override fun autenticar(login: String, senha: String): Boolean {
            return login == cnpj && senha == this.senha
        }

        override fun toString(): String {
            return cnpj
        }
    }

    class Fornecedor(
        var funcional: String,
        var senha: String
    ): UsuarioAutenticavel {
        override fun autenticar(login: String, senha: String): Boolean {
            return login == funcional && senha == this.senha
        }

        override fun toString(): String {
            return funcional
        }
    }

    val user1 = Vendedor("123.456.789-00", "vendedor123")
    val user2 = Fornecedor("987.654.321-00", "fornecedor123")

    println(user1)
    println(user2)
}