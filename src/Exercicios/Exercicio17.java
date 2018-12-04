package Exercicios;

public class Exercicio17 {

    public Exercicio17() {
        Principal p = new Principal();
        System.out.println("Digite o CPF para validar: ");

        String cpf = p.Sc.next();

        /* Para fazer a verificação do primeiro dígito:
		1º Distribua os 9 primeiros dígitos do CPF na primeira linha de uma tabela, e na 
		linha abaixo distribua os pesos 10, 9, 8, 7, 6, 5, 4, 3, 2.

		2º Multiplique os valores de cada coluna.

		3º Calcule a somatória dos resultados.

		4º  O resultado obtido será divido por 11. Considere como quociente apenas o valor 
		inteiro obtido na divisão, o resto da divisão será responsável pelo cálculo do 
		primeiro dígito verificador.

		5º Caso o resto da divisão seja menor que 2, o nosso primeiro dígito verificador 
		se torna 0, caso contrário subtrai-se o valor obtido de 11.  

         */
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt("" + cpf.charAt(i));
            soma += num * (i + 1);
        }

        int dv1 = (soma % 11) % 10; // para ninjas

        soma = 0;

        for (int i = 1; i < 9; i++) {
            int num = Integer.parseInt("" + cpf.charAt(i));
            soma += num * i;
        }

        soma += dv1 * 9;

        int dv2 = (soma % 11) % 10;

        System.out.println(dv1);

        System.out.println(dv2);

        if (Integer.parseInt("" + cpf.charAt(9)) == dv1 && Integer.parseInt("" + cpf.charAt(10)) == dv2) {
            System.out.println("CPF valido! :)");
        } else {
            System.out.println("CPF invalido! :(");
        }


        /* Para fazer a verificação do segundo dígito:
		1º Para o cálculo do segundo dígito será usado o primeiro dígito verificador já
		calculado. Montaremos uma tabela semelhante a anterior só que desta vez usaremos
		na segunda linha os valores 11,10,9,8,7,6,5,4,3,2 já que estamos incorporando mais
		um algarismo para esse cálculo. 

		2º Na próxima etapa faremos como na situação do cálculo do primeiro dígito verificador,
		multiplicaremos os valores de cada coluna e efetuaremos o somatório dos resultados
		obtidos.

		3º Realizamos novamente o cálculo do módulo 11. Dividimos o total do somatório por 11
		e consideramos o resto da divisão.

		4º  Caso o valor do resto da divisão seja menor que 2, esse valor passa 
		automaticamente a ser zero, caso contrário é necessário subtrair o valor obtido de 11
		para se obter o dígito verificador. 

         */
        switch (cpf.charAt(8)) {

            case '0':
                System.out.println("Voce eh do Rio Grande do Sul!");
                break;

            case '1':
                System.out.println("Voce nasceu em um destes estados: Distrito Federal – Goiás – Mato Grosso – Mato Grosso do Sul – Tocantins");
                break;

            case '2':
                System.out.println("Voce nasceu em um destes estados: Pará – Amazonas – Acre – Amapá – Rondônia – Roraima");
                break;

            case '3':
                System.out.println("Voce nasceu em um destes estados: Ceará – Maranhão – Piauí");
                break;

            case '4':
                System.out.println("Voce nasceu em um destes estados: Pernambuco – Rio Grande do Norte – Paraíba – Alagoas");
                break;

            case '5':
                System.out.println("Voce nasceu em um destes estados:Bahia – Sergipe");
                break;

            case '6':
                System.out.println("Voce eh de Minas Gerais!");
                break;

            case '7':
                System.out.println("Voce nasceu em um destes estados: Rio de Janeiro – Espírito Santo");
                break;

            case '8':
                System.out.println("Voce eh de Sao Paulo!");
                break;

            case '9':
                System.out.println("Voce nasceu no Parana ou Santa Catarina!");
                break;

        }

        /*
		Último código de Identificação por Estado:      

		Código 0:  Rio Grande do Sul    
		Código 1:  Distrito Federal – Goiás – Mato Grosso – Mato Grosso do Sul – Tocantins    
		Código 2:  Pará – Amazonas – Acre – Amapá – Rondônia – Roraima    
		Código 3:  Ceará – Maranhão – Piauí    
		Código 4:  Pernambuco – Rio Grande do Norte – Paraíba – Alagoas    
		Código 5:  Bahia – Sergipe    
		Código 6:  Minas Gerais    
		Código 7:  Rio de Janeiro – Espírito Santo
		Código 8:  São Paulo
		Código 9:  Paraná – Santa Catarina
         */
    }
}
