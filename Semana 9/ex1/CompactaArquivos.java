package arquivos;

import java.util.Scanner;

public class CompactaArquivos {
   public static void main(String[] args) {
      int n;
      String arquivo;
      Scanner teclado = new Scanner(System.in);
      PastaCompactada<Texto> pastaTextos = new PastaCompactada<Texto>();
      PastaCompactada<Imagem> pastaImagens = new PastaCompactada<Imagem>();

      n = teclado.nextInt();
      for(int i = 0; i <= n; i++) {
         arquivo = teclado.nextLine();
         if(arquivo.equals("Texto"))
            pastaTextos.adicionar(new Texto());
         else if(arquivo.equals("TextoTXT"))
            pastaTextos.adicionar(new TextoTXT());
         else if(arquivo.equals("TextoDOCX"))
            pastaTextos.adicionar(new TextoDOCX());
         else if(arquivo.equals("Imagem"))
            pastaImagens.adicionar(new Imagem());
         else if(arquivo.equals("ImagemPNG"))
            pastaImagens.adicionar(new ImagemPNG());
         else if(arquivo.equals("ImagemJPEG"))
            pastaImagens.adicionar(new ImagemJPEG());
      }
      pastaTextos.imprimir();
      pastaImagens.imprimir();
   }
}