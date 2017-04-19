package Lista;

public class Pilha extends Lista implements IPilha
{
	private Lista lst = new Lista();
	public Object pop()
	{
		return lst.retIni();
	}
	
	public void push(Object obj)
	{
		lst.insIni(obj);
	}
	
	public boolean vazio()
	{
		return lst.vazio();
	}
}
