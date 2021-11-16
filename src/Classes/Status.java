package Classes;

import java.time.LocalDate;

public class Status {
     
    private LocalDate datalocacao;
    private String cpf;
    private Livros codigo;
    private LocalDate datadevolucao;
    private String status;
   
    public LocalDate getDatalocacao() {
        return datalocacao;
    }
 
    public void setDatalocacao(LocalDate datalocacao) {
        this.datalocacao = datalocacao;
    }

    public String getCpf() {
        return cpf;
    }
   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    public Livros getCodigo() {
        return codigo;
    }
  
    public void setCodigo(Livros codigo) {
        this.codigo = codigo;
    }
  
    public LocalDate getDatadevolucao() {
        return datadevolucao;
    }
  
    public void setDatadevolucao(LocalDate datadevolucao) {
        this.datadevolucao = datadevolucao;
    }
  
    public String getStatus() {
        return status;
    }
   
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "------------------------------------------ \nCodigo: " + codigo + "\nCPF do locador: " + cpf + "\nData da locação: " + datalocacao + "\nData de devolução: "
                + datadevolucao + "\nStatus:" + status + "]";
    }

    
}
