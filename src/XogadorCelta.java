import java.io.Serializable;
import java.math.BigDecimal;

public class XogadorCelta implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private BigDecimal soldo;

    public XogadorCelta() { }

    public XogadorCelta(String nome, BigDecimal soldo) {
        this(0, nome, soldo);
    }

    public XogadorCelta(int id, String nome, BigDecimal soldo) {
        this.id = id;
        this.nome = nome;
        this.soldo = soldo;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public BigDecimal getSoldo() {return soldo;}

    public void setSoldo(BigDecimal soldo) {this.soldo = soldo;}

    @Override
    public String toString() {
        return "XogadorCelta{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", soldo=" + soldo +
                '}';
    }
}

