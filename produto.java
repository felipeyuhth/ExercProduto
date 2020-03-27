package ExercProduto;

public class produto {
  private String nome;
  private double precoCusto;
  private double precoVenda;
  private double margemLucro;
  private double margemLucroP;
 
  public String getnome() {
	   return nome;
  }
  
  public void setnome(String nome) {
	   this.nome = nome;
  }
  
  public double getprecoCusto() {
	  return precoCusto;
  }
  
  public void setprecoCusto(double precoCusto) {
	  this.precoCusto = precoCusto;
  }
  
  public double getprecoVenda() {
	  return precoVenda;
  }
  
  public void setprecoVenda(double precoVenda) {
	  this.precoVenda = precoVenda;
  }
  
  public double getmargemLucro() {
	  return margemLucro;
  }
  
  public void setmargemLucro(double margemLucro) {
	  this.margemLucro = margemLucro;
  }
  
  public double getmargemLucroP() {
	  return margemLucroP;
  }
  
  public void setmargemLucroP(double margemLucroP) {
	  this.margemLucroP = margemLucroP;
  }
  
  public void margemLucro() {
	  if(precoVenda < precoCusto) {
		 System.out.println("O produto não tera margem de lucro"); 
	  }
	  else {
		  margemLucro = precoVenda - precoCusto;
		  System.out.println("a margem de lucro sera: R$"+getmargemLucro()+" e o percentual sera de "+getmargemLucroP()+" %");
	  }
  }
  
  public void margemLucroP() {
	       margemLucroP = (precoVenda - precoCusto) * 100;
  }
  
  }

