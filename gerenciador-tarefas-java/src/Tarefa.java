public class Tarefa {

    private String titulo;
    private String descricao;
    private String datavenc;
    private String status;
    private String codigo;

    public Tarefa(String titulo, String descricao, String datavenc, String status, String codigo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.datavenc = datavenc;
        this.status = status;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDatavenc() {
        return datavenc;
    }

    public void setDatavenc(String datavenc) {
        this.datavenc = datavenc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de vencimento: " + this.datavenc);
        System.out.println("Status: " + this.status);
        System.out.println("Código: " + this.codigo);
        System.out.println("------------------------------------");
    }
}
