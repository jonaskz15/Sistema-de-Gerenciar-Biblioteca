package Teste;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Scanner;

import Classe.Cliente;
import Classe.Produto;
import Classe.Vendedor;
import Interface.*;
import Repositorio.*;
import telas.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Cliente eli = new Cliente("eli", "123", "elias@gmail.com", 20, "66644433321");
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(eli);
		List<Compra> compras = new ArrayList<>();
		
		Vendedor elias = new Vendedor("elias", "123", "elias@gmail.com");
		List<Vendedor> vendedores = new ArrayList<>();
		vendedores.add(elias);
		
		Produto p1 = new Produto("arroz", "urbano", 15, 1, 3.65);
		Produto p2 = new Produto("feijao", "kicaldo", 17, 2, 9.85);
		Produto p3 = new Produto("macarrao", "gostoso", 23, 3, 4.5);
		Produto p4 = new Produto("cuscuz", "santa clara", 13, 4, 3.5);
		Produto p5 = new Produto("cola", "refri", 11, 5, 4.5);
		Produto p6 = new Produto("leite", "itambe", 15, 6, 7.40);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(p1);produtos.add(p2);produtos.add(p3);produtos.add(p4);produtos.add(p5);produtos.add(p6);
		
		Mercado padrecicero = new Mercado(clientes, vendedores, produtos, compras);
		
		Cliente cliente = new ClienteImpl(nome, email);
                Vendedor vendedor = new VendedorImpl(nome, email);
                Produto produto = new ProdutoImpl(produtos, preco);

                cliente.comprar(produto);
                vendedor.vender(produto, cliente);
		
		//loop para menu de seleção
		boolean loop = true;
		while(loop) {
			loop = padrecicero.menu();
		}


	}
}
