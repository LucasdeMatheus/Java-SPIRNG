
package br.com.alura.screammatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime");

    private String categoriaOMDB;

    private  String categoriaPortugues;

    Categoria(String categoriaOMDB, String categoriaPortugues) {
        this.categoriaPortugues = categoriaPortugues;
        this.categoriaOMDB = categoriaOMDB;
    }
    public static Categoria fromString(String text) {
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaOMDB.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrado");
    }

    public static Categoria fromPortugues(String text) {
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaPortugues.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrado");
    }
}