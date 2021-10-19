import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario extends Exception {
   public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);

      int n = teclado.nextInt();
      Usuario lista[] = new Usuario[n];
      String login, senha;

      for (int i = 0; i < n; i++) {
         login = teclado.next();
         senha = teclado.next();
         Usuario novo = new Usuario(login, senha);
         lista[i] = novo;
      }

      int indice = 0, k = teclado.nextInt();

      for (int i = 0; i < k; i++) {
         try {
            login = teclado.next();
            senha = teclado.next();
            indice = buscarIndiceUsuario(lista, login);
            lista[indice].autenticar(senha);
            Impressao.imprimirUsuarioAutenticado(lista[indice].getLogin());
         } 
         catch (SenhaInvalida e) {
            Impressao.imprimirSenhaInvalida(lista[indice].getLogin());
         } 
         catch (UsuarioBloqueado e) {
            Impressao.imprimirUsuarioBloqueado(lista[indice].getLogin());
         }
      }
      teclado.close();
   }

   public static int buscarIndiceUsuario(Usuario[] lista, String login) {
      for(int i = 0; i < lista.length; i++) {
         if(lista[i].getLogin().equals(login))
            return i;
      }
      return -1;
   }
}
