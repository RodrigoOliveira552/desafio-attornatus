package br.com.gerenciarpessoas.model;

public class Enderecos {
    public String logradouro;

    public String cep;

    public String numero;

    public String cidade;

    public Enderecos(String logradouro, String cep, String numero, String cidade) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }
}
