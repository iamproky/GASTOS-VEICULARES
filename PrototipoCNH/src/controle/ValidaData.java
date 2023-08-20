/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.regex.Pattern;
/**
 *
 * @author Aluno
 */ 
public class ValidaData {
	static{
		padraoDia = Pattern.compile("([1-9]|0[1-9])|[1-2][0-9]|3[0-1]");
		padraoMes = Pattern.compile("(0[1-9]|[1-9])|1[0-2]");
		padraoAno = Pattern.compile("/d{2} | /d{4}");
		padraoDataCompleta = Pattern.compile("(d+-/d+-/d+ | d+/ d+/ d+)");
		padraoFevereiro = Pattern.compile("2|02");
		padraoDiaFevereiroAnoBissexto = Pattern.compile("(0[1-9]|[1-2][0-9])");
		padraoDiaFevereiro = Pattern.compile("(0[1-9]|[1-2][0-8])");
	}
	private static Pattern padraoDia;
	private static Pattern padraoMes;
	private static Pattern padraoAno;
	private static Pattern padraoDataCompleta;
	private static Pattern padraoFevereiro;
	private static Pattern padraoDiaFevereiroAnoBissexto;
	private static Pattern padraoDiaFevereiro;

	
	
	public boolean IsData (String data){
		//primeiro verifica se a data está na formatação esperadab
		if (! padraoDataCompleta.matcher(data).matches()){
			return false;
		}
		//se chegar aqui, quebra a data em partes
		String [] aux = data.split("-|/");
		String dia = aux [0];
		String mes = aux[1];
		String ano = aux[2];
		
		//começa validando o ano		
		if (this.validaAno(ano)){
			//trata ano bissexto
			if (this.isAnoBissexto(ano))
				if (this.isFevereiro(mes))
					return this.validaDiaFevereiroAnoBissexto(dia);
				
			//se chegar aqui já validou o ano, e já se sabe que o ano não é bissexto
			//verifica o mês
			if (this.isFevereiro(mes))
				//se for fevereiro, valida o dia
				return this.validaDiaFevereiro(dia);
			
			//se não for fevereiro, valida o dia e o mes
			if (this.validaDia(dia) && this.validaMes(mes))
				return true;
		}
		//pega quaisquer falhas nos if's acima e retorna false
		return false;
	}
	
	
	private boolean isAnoBissexto(String ano){
		int anoInt = Integer.parseInt (ano);
		boolean isAnoBissexto = ((anoInt % 4 == 0 && anoInt % 100 != 0) ||(anoInt % 400 == 0) );
		return isAnoBissexto;
	}
	private boolean isFevereiro (String mes){
		return padraoFevereiro.matcher(mes).matches();
	}
	private boolean validaAno (String ano){
		return padraoAno.matcher(ano).matches();
	}
	private boolean validaDiaFevereiroAnoBissexto (String dia){
		return padraoDiaFevereiroAnoBissexto.matcher(dia).matches();
	}
	private boolean validaDia (String dia){
		return padraoDia.matcher(dia).matches();
	}
	private boolean validaMes (String mes){
		return padraoMes.matcher(mes).matches();
	}
	private boolean validaDiaFevereiro(String dia){
		return padraoDiaFevereiro.matcher(dia).matches();
	}
	
	
}