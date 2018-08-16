import java.util.Scanner;

public class FrequenciaCardiaca{
	public.static.void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		FrequenciaCardiaca paciente = new FrequenciaCardiaca("Henrique", "Stepic", 28, 12, 1999);
		
        System.out.println("\nIdade: " + paciente.idade());
        System.out.println("Frequencia max: " + paciente.getFcamax());
        paciente.getInterval();
	}