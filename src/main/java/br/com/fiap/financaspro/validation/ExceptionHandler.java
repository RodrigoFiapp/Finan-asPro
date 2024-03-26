package br.com.fiap.financaspro.validation;

import org.springframework.web.bind.MethodArgumentNotValidException;

public @interface ExceptionHandler {

    Class<MethodArgumentNotValidException> value();

}
