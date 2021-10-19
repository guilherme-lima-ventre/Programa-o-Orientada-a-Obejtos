public class CrachaEstudante extends Cracha {
   protected String curso;

   public CrachaEstudante() {
      String curso = new String();
   }
   public void setCurso(String curso) {
      this.curso = curso;
   }
   @Override
   public void imprimir() {
      Impressao.imprimirLinha("ESTUDANTE");
      Impressao.imprimirLinha("Nome: " + this.nome);
      Impressao.imprimirLinha("Curso: " + this.curso);
   }
}
