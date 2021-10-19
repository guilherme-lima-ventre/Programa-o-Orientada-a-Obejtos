package criptografia;
public class Zenitpolar implements Cifra{
    public String cifrar(String mensagem){
        char msgCifrada[] = new char[mensagem.length()];
        for(int i = 0; i < mensagem.length(); i++){
            if(mensagem.charAt(i) == 'z')
                msgCifrada[i] = 'p';
            else if(mensagem.charAt(i) == 'p')
                msgCifrada[i] = 'z';
            else if(mensagem.charAt(i) == 'e')
                msgCifrada[i] = 'o';
            else if(mensagem.charAt(i) == 'o')
                msgCifrada[i] = 'e';
            else if(mensagem.charAt(i) == 'n')
                msgCifrada[i] = 'l';
            else if(mensagem.charAt(i) == 'l')
                msgCifrada[i] = 'n';
            else if(mensagem.charAt(i) == 'i')
                msgCifrada[i] = 'a';
            else if(mensagem.charAt(i) == 'a')
                msgCifrada[i] = 'i';
            else if(mensagem.charAt(i) == 't')
                msgCifrada[i] = 'r';
            else if(mensagem.charAt(i) == 'r')
                msgCifrada[i] = 't';
            else 
                msgCifrada[i] = mensagem.charAt(i);
        }
        String retorno = new String(msgCifrada);
        return retorno;
    }
    public String decifrar(String mensagem){
        char msgDecifrada[] = new char[mensagem.length()];
        for(int i = 0; i < mensagem.length(); i++){
            if(mensagem.charAt(i) == 'z')
               msgDecifrada[i] = 'p';
            else if(mensagem.charAt(i) == 'p')
               msgDecifrada[i] = 'z';
            else if(mensagem.charAt(i) == 'e')
               msgDecifrada[i] = 'o';
            else if(mensagem.charAt(i) == 'o')
               msgDecifrada[i] = 'e';
            else if(mensagem.charAt(i) == 'n')
               msgDecifrada[i] = 'l';
            else if(mensagem.charAt(i) == 'l')
               msgDecifrada[i] = 'n';
            else if(mensagem.charAt(i) == 'i')
               msgDecifrada[i] = 'a';
            else if(mensagem.charAt(i) == 'a')
               msgDecifrada[i] = 'i';
            else if(mensagem.charAt(i) == 't')
               msgDecifrada[i] = 'r';
            else if(mensagem.charAt(i) == 'r')
               msgDecifrada[i] = 't';
            else 
               msgDecifrada[i] = mensagem.charAt(i);
        }
        String retorno = new String(msgDecifrada);
        return retorno;
    }
}