package com.example.forum.config.validation;

public class FormErrorDto {
    private final String campo;
    private final String erro;

    public FormErrorDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
