package criptografia;

public class CifraCesar implements Cifra {
   private int nShifts;

   public CifraCesar(int nShifts) {
      while(nShifts >= 26 || nShifts <= -26)
         nShifts = nShifts % 26;
      this.nShifts = nShifts;
   }
   public String cifrar(String mensagem) {
      char msgCifrada[] = new char[mensagem.length()];
      char charCifrado;
      for(int i = 0; i < mensagem.length(); i++) {
         charCifrado = mensagem.charAt(i);
         if(charCifrado == ' ');
         else if(nShifts > 0) {
            charCifrado += nShifts;
            if(charCifrado > 'z') {
               int somar = (int) charCifrado - (int) 'z';
               charCifrado = (char) ((int) 'a' + somar - 1);
            }
         }
         else if(nShifts < 0) {
            charCifrado -= nShifts;
            if(charCifrado < 'a') {
               int tirar = (int) 'a' - (int) charCifrado;
               charCifrado = (char) ((int) 'z' - tirar);
            }
         }
         msgCifrada[i] = charCifrado;
      }
      String stringCifrada = new String(msgCifrada);
      return (stringCifrada);
   }
   public String decifrar(String mensagem) {
      char msgDecifrada[] = new char[mensagem.length()];
      char charDecifrado;
      for(int i = 0; i < mensagem.length(); i++) {
         charDecifrado = mensagem.charAt(i);
         if(charDecifrado == ' ');
         else if(nShifts > 0) {
            charDecifrado -= nShifts;
            if(charDecifrado < 'a') {
               int tirar = (int) 'a' - (int) charDecifrado;
               charDecifrado = (char) ((int) 'z' - tirar + 1);
            }
         }
         else if(nShifts < 0) {
            charDecifrado += nShifts;
            if(charDecifrado > 'z') {
               int somar = (int) charDecifrado - (int) 'z';
               charDecifrado = (char) ((int) 'a' + somar);
            }
         }
         msgDecifrada[i] = charDecifrado;
      }
      String stringDecifrada = new String(msgDecifrada);
      return (stringDecifrada);
   }
}
