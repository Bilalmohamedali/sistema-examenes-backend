package com.sistema.examenes.exepciones;

public class UsuarioFoundException extends Exception{

    public UsuarioFoundException () {
        super ("El usuario con ese username ya existe, pruebe con uno diferente.");
    }

    public UsuarioFoundException(String mensaje) {
        super(mensaje);
    }
}
