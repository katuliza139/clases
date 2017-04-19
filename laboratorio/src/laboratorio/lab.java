package laboratorio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab {
	public static void main (String[] args){
		String patron = ("(una|copas|de|dia)|([0-9]+)|([+|-|*|/|<|>|%])|([a-z0-9]+)");
		//expresion a evaluar
		String Texto = "95 + 32 copas de vino al dia todo el mes de marzo nos da un % de 85 < a 100";
		
		Pattern p = Pattern.compile(patron);
		Matcher matcher = p.matcher(Texto);
		
		System.out.println("Compiladores * prueba analisis lexico");
		
		while(matcher.find())
		{
			String tokenTipo1 = matcher.group(1);
			if(tokenTipo1 != null)
			{
				System.out.println("palabra reservada: "+ tokenTipo1);
			}
			
			
			String tokenTipo2 = matcher.group(2);
			if(tokenTipo2 != null)
			{
				System.out.println("numero: "+ tokenTipo2);
			}
			
			
			String tokenTipo3 = matcher.group(3);
			if(tokenTipo3 != null)
			{
				System.out.println("operador: "+ tokenTipo3);
			}
			
			
			String tokenTipo4 = matcher.group(4);
			if(tokenTipo4 != null)
			{
				System.out.println("variable: "+ tokenTipo4);
			}
			
		}
		
	}

}
