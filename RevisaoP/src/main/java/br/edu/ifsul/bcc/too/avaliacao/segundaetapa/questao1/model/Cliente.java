/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Collection;
/**
 *
 * @author 20221PF.CC0024
 */
public class Cliente extends Pessoa{
    private String observacoes;
    private Pessoa pessoa;
    private Collection<Veiculo> veiculo;

    public Cliente(String observacoes, Pessoa pessoa, Collection<Veiculo> veiculo) {
        this.observacoes = observacoes;
        this.pessoa = pessoa;
        this.veiculo = veiculo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Collection<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Collection<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    
}
