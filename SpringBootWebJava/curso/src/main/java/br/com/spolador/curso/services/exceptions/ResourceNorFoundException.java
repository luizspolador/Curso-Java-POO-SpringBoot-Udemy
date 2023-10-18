package br.com.spolador.curso.services.exceptions;

public class ResourceNorFoundException extends RuntimeException{ // compilador não obriga tratar
    private static final long serialVersionUID = 1L;
    public ResourceNorFoundException(Object id){
        super("Resource not found. ID " + id);
    }
}
