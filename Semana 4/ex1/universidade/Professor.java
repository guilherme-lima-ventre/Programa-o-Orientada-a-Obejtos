package universidade;

public class Professor extends Pessoa{
    public Professor() {
        super.setNomeSobrenome("Professor sem nome", "Professor sem sobrenome");
    }
    @Override
    public String getEmail() {
        return this.nome + "." + this.sobrenome + "@professor.ufabc.edu.br";
    }
    @Override
    public String getVinculo() {
        return "Professor da UFABC";
    }
}
