package main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class main {

	public static void main(String[] args) {	
		Scanner read = new Scanner(System.in);
		
		Collection<Float> transacao = new ArrayList();
		
		int count = 0, id = 0;
		float valor = 0, min, max, avg, sum = 0;
		Date dataHora;
		
		long tempoInicio = System.currentTimeMillis();
		while((System.currentTimeMillis()-tempoInicio)<60000) {			
			System.out.println("Digite um valor em R$: ");		
			transacao.add(valor = read.nextFloat());
			
			while((System.currentTimeMillis()-tempoInicio)<60000) {
				if(valor<0) {
					System.out.println("Digite um valor em R$: ");		
					transacao.add(valor = read.nextFloat());					
				}else {
					count++;
					id++;
					sum=sum+valor;
				}
			}
			
			//Min e maximo é necessário utilizar o foreach
			
		}		
		System.out.println("Transações "+count+"\nTotal R$ "+sum+"\n");
		transacao.removeAll(transacao);
		System.out.println("Transações "+count+"\nTotal R$ "+sum+"\n");
	}
}
