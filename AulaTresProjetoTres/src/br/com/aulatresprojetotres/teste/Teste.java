package br.com.aulatresprojetotres.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadepai = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do pai"));
		int idadefilho = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do filho"));
		double media = (idadepai+idadefilho)/2;
		
		if(media >= 50)
		{
			System.out.println("Provavelmente o filho e maior de idade. Pois ele tem " + idadefilho + " anos. E a média de suas iadades é "+media);
		}
		else{
			System.out.println("Provavelmente o filho e menor de idade. Pois ele tem " + idadefilho + " anos. E a média de suas iadades é "+media);
       