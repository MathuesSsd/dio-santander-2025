package ContaBanco.validator;

import ContaBanco.exception.ValidatorException;
import ContaBanco.model.UserModel;

public class UserValidator {
    
    private UserValidator(){
        
    }

    public static void verifyModel(final UserModel model) throws ValidatorException{
        if (stringIsBlank(model.getName())) 
            throw new ValidatorException("Informe um nome válido");

        if (model.getName().length() <= 1) 
            throw new ValidatorException("O nome deve ser maior que um caracter");
        
        if (stringIsBlank(model.getEmail())) 
            throw new ValidatorException("Informe um e-mail válido");

        if ((!model.getEmail().contains("@")) || (!model.getEmail().contains(".")))
            throw new ValidatorException("Informe um email válido");
    }

    private static boolean stringIsBlank(final String value){
        return value == null || value.isBlank();
    }

}
