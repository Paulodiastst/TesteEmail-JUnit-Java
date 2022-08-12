package enviando.email;

public class AppTest {

	@org.junit.Test
	public void testeEmail() throws Exception {

		StringBuilder stringBuilderTextoEmail = new StringBuilder();

		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso.<br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo.<br/><br/>");

		stringBuilderTextoEmail.append("<b>Login:</b> paulo@teste.com.br<br/>");
		stringBuilderTextoEmail.append("<b>Senha:</b> dsidnhsdnshd<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://paulodiastst.github.io/Landing_Page_Paulo\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius: 30px; font-size:20px; font-family:courier; border:3px solid green; background-color: #99DA39;\">Acessar Portal do Aluno</a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\"font-size:8px\">Ass.: Paulo Roberto</span>");
		
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("paulodiastst@hotmail.com, paulodiastst@gmail.com",
									 "Paulo teste e-mail Java", 
									 "Testando e-mail com Java", 
									 stringBuilderTextoEmail.toString());

		enviaEmail.enviarEmailAnexo(true);

		/*
		 * Caso o email não esteja sendo enviado então coloque um tempo de espera, mais
		 * isso só pode ser usado para testes.
		 */

		Thread.sleep(5000);
	}
}
