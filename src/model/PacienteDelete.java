
package model;

public class PacienteDelete {
    private int id;
    private String nome;
    private float peso;
    private float altura;
  
// InsertCode - Contrutor => NAO SELECIONAR ATRIBUTOS
    public PacienteDelete() {
    }
  
     
// InsertCode - Contrutor selecionando todos os atributos

      public PacienteDelete(int id, String nome, float peso, float altura) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
  
    
// InsertCode - Mtodos Getters/Setters   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
  
    
 // Insert Code Assinatura Override To String ( referenciar Nome )

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return nome;
    }
   
}



