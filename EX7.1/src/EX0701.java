import Lista.*;
import ir.*;

public class EX0701
{
 public static void main(String[] args)
 {
 Pilha x = new Pilha();
 
 Contribuinte c;

 c=new PFisica("Joao Santos",3000.00,"11111");
 x.push(c);
 c=new PJuridica("Lojas AA",150000.00,"10055");
 x.push(c);
 c=new PFisica("Maria Soares",5000.00,"22222");
 x.push(c);
 c=new PJuridica("Supermercados B",2000000.00,"10066");
 x.push(c);
 c=new PFisica("Carla Maia",1500.00,"33333");
 x.push(c);
 c=new PJuridica("Posto XX",500000.00,"10077");
 x.push(c);
 

 while(!x.vazio())
 {
 c=(Contribuinte) x.pop();
 System.out.println(c.getNome() + "  " + c.calcImposto());
 }
 }
} 