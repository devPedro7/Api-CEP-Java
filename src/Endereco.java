public class Endereco {
    
    
    private String logradouro;
    private String cep;
    private String localidade;
    private String bairro;
    private String uf;
    private String complemento;


    
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    @Override
    public String toString() {
        return "Endereco: ( Logradouro: " + logradouro + ", Cep: " + cep + ", Localidade: " + localidade + ", Bairro: "
                + bairro + ", UF: " + uf + ", Complemento: " + complemento + " )";
    }

}
