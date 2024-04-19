abstract class Despesa {
    private String descricao;
    private double valorTotal;
    public void cadastrarDespesa(){}
    public abstract void calcularDespesa();
    public abstract void listarDespesas();


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}