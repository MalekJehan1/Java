/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;

/**
 *
 * @author 20221PF.CC0024
 */
public class Funcionario extends Pessoa {
    String numero_ctps;
    Calendar data_admissao;
    Calendar data_demissao;
    Cargo cargo;
    Pessoa pessoa;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, Calendar data_nascimento, String cep, String complemento) {
        super(cpf, nome, data_nascimento, cep, complemento);
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
