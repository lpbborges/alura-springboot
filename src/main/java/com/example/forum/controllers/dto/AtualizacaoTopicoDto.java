package com.example.forum.controllers.dto;

import com.example.forum.models.Topico;
import com.example.forum.repository.TopicoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizacaoTopicoDto {
    @NotNull
    @NotEmpty
    private String titulo;

    @NotNull
    @NotEmpty
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(
                        "Tópico com id " + id + " não existe"
                ));

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
