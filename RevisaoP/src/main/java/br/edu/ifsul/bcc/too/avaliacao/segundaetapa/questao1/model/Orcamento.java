/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20221PF.CC0024
 */
public class Orcamento {
    private Integer id;
    private String observacoes;
    private Calendar data;
    private Collection<Peca> peca;
    private Collection<MaoObra> maoObra;
    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;

    public Orcamento() {
    }

    public Orcamento(Integer id, String observacoes, Calendar data, Collection<Peca> peca, Collection<MaoObra> maoObra, Veiculo veiculo, Cliente cliente, Funcionario funcionario) {
        this.id = id;
        this.observacoes = observacoes;
        this.data = data;
        this.peca = peca;
        this.maoObra = maoObra;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Collection<Peca> getPeca() {
        return peca;
    }

    public void setPeca(Collection<Peca> peca) {
        this.peca = peca;
    }

    public Collection<MaoObra> getMaoObra() {
        return maoObra;
    }

    public void setMaoObra(Collection<MaoObra> maoObra) {
        this.maoObra = maoObra;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
