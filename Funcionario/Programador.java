public class Programador extends Funcionario{
    
    private double salarioBase = 5000.00;
    private double bonificacao= 200.00;
    private int projetos;

    
    

    public Programador(String nome, int projetos) {
        super(nome);
        this.projetos = projetos;
    }



    @Override
    public double calcularSalario(){
        return salarioBase + bonificacao * projetos;
        
    }
}
