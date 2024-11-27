package br.com.academytechmaster.pookotlinencapsulamento

//Implemantação do Encapsulamento na classe Livro

class Livro(

    //sintaxe do Kotlin _ para tornar private
    private var _titulo: String,
    private var _autor: String,
    private var _editora: String,
    private var _localizacao: String,
    private var _paginas: Int

){
    //getter e setter em kotlin, para titulo
     var titulo: String
         get() = _titulo
         set(valor) {
             _titulo = valor
         }

    var autor: String
        get() = _autor
        set(valor) {
            _autor = valor
        }

    var editora: String
        get() = _editora
        set(valor) {
            _editora = valor
        }

    var localizacao: String
        get() = _localizacao
        set(valor) {
            _localizacao = valor
        }

    var paginas: Int
        get() = _paginas
        set(valor) {
            _paginas = valor

        }
}