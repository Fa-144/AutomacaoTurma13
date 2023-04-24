package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
			
	private By btnparavoce = By.id("bt1");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getCamponome() {
		return camponome;
	}

	public By getCampotelefone() {
		return campotelefone;
	}

	public By getCampoemail() {
		return campoemail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnQueroSercliente() {
		return btnQueroSercliente;
	}

	public By getTextofaltaPouco() {
		return textofaltaPouco;
	}

	private By camponome = By.id("nome");
	private By campotelefone = By.id("telefone");
	private By campoemail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSercliente = By.id("btnEnviar");
	private By textofaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnparavoce() {
		return btnparavoce;
	}
}
