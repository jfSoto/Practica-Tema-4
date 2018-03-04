package es.studium.Moto;

public class Moto
{
	String matricula;
	int cilindrada;
	public Moto() 
	{
		matricula = "";
		cilindrada = 0;
	}
	public Moto(String m, int c) 
	{
		matricula = m;
		cilindrada = c;
	}
	public String getMatricula()
	{
		return matricula;
	}
	public int getCilindrada () 
	{
		return cilindrada;
	}
	//Zampame

}
