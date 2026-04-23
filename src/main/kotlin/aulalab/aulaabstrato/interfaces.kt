package aulalab.aulaabstrato

interface UsuarioAutenticavel {
    fun autenticar(login: String, senha: String): Boolean


}