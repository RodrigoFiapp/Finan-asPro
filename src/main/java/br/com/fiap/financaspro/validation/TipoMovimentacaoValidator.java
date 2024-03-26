package br.com.fiap.financaspro.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoMovimentacaoValidator implements ConstraintValidator<TipoMovimentacao, String> {

    //método recebe um valor e serve para ver se é válido
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
      return value.equals("ENTRADA") || value.equals("SAIDA");
    }
    
}
