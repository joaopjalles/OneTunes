package br.com.alura.onetunes.modelos;

public class Audio {
    private String titulo;
    private int totalReporducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReporducoes() {
        return totalReporducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReporducoes++;
    }
}
