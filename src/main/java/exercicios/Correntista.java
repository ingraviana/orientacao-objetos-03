package exercicios;

public class Correntista {

    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista(Integer codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
    }
    public Correntista(Integer codigo, String nome, String email, String telefone){
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }
    public void setCodigo(Integer codigo){
        if (codigo <= 0){
            throw new IllegalArgumentException("Codigo deve ser maior que 0");
        }
        this.codigo = codigo;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        if (nome.trim().length() < 4){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String email){
        if (email.trim().length() < 11){
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone(String telefone){
        if (telefone.trim().length() <= 8){
            throw new IllegalArgumentException("Telefone invalido");
        }
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

}
