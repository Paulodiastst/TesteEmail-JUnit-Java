package enviando.email;

public class AppTest {

	@org.junit.Test
	public void testeEmail() throws Exception {

		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("paulodiastst@hotmail.com, paulodiastst@gmail.com", 
									 "Paulo teste e-mail Java",
									 "Testando e-mail com Java",
									 "Essse texto e a descrição do meu e-mail");

		enviaEmail.enviarEmail();

		/*
		 * Caso o email não esteja sendo enviado então coloque um tempo de espera, mais
		 * isso só pode ser usado para testes.
		 */

		Thread.sleep(5000);

	}

}
