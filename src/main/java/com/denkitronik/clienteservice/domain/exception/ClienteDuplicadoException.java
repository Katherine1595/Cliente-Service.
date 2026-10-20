package com.denkitronik.clienteservice.domain.exception;

public class ClienteDuplicadoException extends ClienteServiceException {

    public ClienteDuplicadoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
