package com.sistema.examenes.exepciones;

public class UsuarioNotFoundException extends Exception {

    public UsuarioNotFoundException () {
        super ("El usuario con ese username no existe, pruebe con uno diferente.");
    }

    public UsuarioNotFoundException(String mensaje) {
        super(mensaje);
    }

}
