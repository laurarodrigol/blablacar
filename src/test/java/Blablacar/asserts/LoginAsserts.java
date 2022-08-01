package Blablacar.asserts;

import Blablacar.data.Dataset;
import Blablacar.pages.Login;
import org.junit.jupiter.api.Assertions;

public class LoginAsserts {

    public static void Validate_Error_Message(){
        String Obtained_Message = Login.Get_Error_Message();
        String Expected_Message = Dataset.NotRegisteredEmailMessage;
        Assertions.assertEquals(Obtained_Message,Expected_Message);
    }
}
