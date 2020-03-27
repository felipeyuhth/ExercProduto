package ExercProduto;
import java.util.Scanner;
public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner in = new Scanner (System.in);		
    produto p = new produto();
    double precoVenda,precoCusto;
    
    System.out.println("Digite o valor do custo do produto:");
    precoCusto = in.nextDouble();
	
	System.out.println("Digite o valor da venda:");
	precoVenda = in.nextDouble();

	
	p.setprecoCusto(precoCusto);
	p.setprecoVenda(precoVenda);
	p.margemLucroP();
    p.margemLucro();
    
    
	}

}
