package org.example.Interface.auxiliar;

import org.example.Interface.PermitirAcesso;

public class funcAutentica {
    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
     return permitirAcesso.autenticar();
    }

    public funcAutentica(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
}
