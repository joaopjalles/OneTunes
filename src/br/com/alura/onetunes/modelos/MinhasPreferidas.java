package br.com.alura.onetunes.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é sucesso!");
        } else {
            System.out.println(audio.getTitulo() + " Bem curtidas");
        }
    }
}
