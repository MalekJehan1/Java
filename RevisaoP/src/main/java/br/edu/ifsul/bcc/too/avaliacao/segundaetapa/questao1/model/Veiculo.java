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
public class Veiculo {
    private String placa;
    private String modelo;
    private Integer ano;
    private Calendar data_ultimo_servico;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, Integer ano, Calendar data_ultimo_servico) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.data_ultimo_servico = data_ultimo_servico;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }
}
