package es.studium.TablasMultiplicar;
//Aqu� est�n los import

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TablasMultiplicar
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		int numero,resultado,i;
		System.out.println("Dame un n�mero:");
		numero = Integer.parseInt(lectura.readLine());
		for (i=0;i<=10;i++)
		{
			resultado=numero*i;
			System.out.println(numero+"*"+i+"="+resultado);
		}
	}
}