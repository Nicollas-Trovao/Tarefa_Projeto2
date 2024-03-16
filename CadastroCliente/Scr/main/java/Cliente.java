package Scr.main.java;

import Scr.main.java.DAO.Generics.Persistente;

public class Cliente implements Persistente {

    //Valores:  
    private String nome;
    private Long CPF;
    private int tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    //Getters e Setters:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCPF() {
        return CPF;
    }
    public void setCPF(Long CPF) {
        CPF = CPF;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int i) {
        this.tel = tel;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    }
