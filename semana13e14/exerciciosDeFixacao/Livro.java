package semana13e14.exerciciosDeFixacao;

public class Livro {
// --- Atributos ---
    private String titulo;
    private String autor;
    private int ano;

    // --- Construtor ---
    // (Usado para criar um novo objeto 'Livro' já com os dados)
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // --- Métodos de Acesso (Getters e Setters) ---

    // Título
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Autor
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Ano
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaLivro(Livro[] l, String titulo){
        for(int i = 0; i < l.length; i++){
            if (l[i].getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public Livro retornaLivro(Livro[] l, String titulo){
        for(int i = 0; i < l.length; i++){
            if (l[i].getTitulo().equalsIgnoreCase(titulo)) {
                return l[i];
            }
        }
        return null;
    }

    
}
