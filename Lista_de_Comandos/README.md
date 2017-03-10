Lista de Comando e exemplos em JAVA

<strong>01-Exemplo Como declarar variáveis</strong><br>

```
double  salario;
float nota =10;
int contador;
boolean aprovado = true;
boolean habilitado = false;
String nome = "Joao ";
int vetor[] = new int[4];
```

<strong>02- Exemplo Condicional IF,  Else if e Else</strong>
```
double nota;
if(nota == 10){
   System.out.println("Nota 10");
}else if(nota >= 7 &&  nota <= 9 ){
  System.out.println("Nota entre 7 e 9 ");
}else{
  System.out.println("Nota entre menor que 7");
  }
```


<strong>03-Exemplo Classe Principal JAVA</strong>
```
public class Principal{
    public static void main(String[] args){
        //seu código começa aqui
         Conta novaConta =  new Conta();
         int saldo = novaConta.getSaldo();
        System.out.println("Saldo:" + saldo);
    }}	04-Exemplo entrada e saída com JOptionPane e String
String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
JOptionPane.showMessageDialog(null, "Nome:" + nome);
//Para concatenar String você deve utilizar o operador + como //no exemplo acima.

Exemplo Comparar String 
if(nome.equalsIgnoreCase("joao")){
    JOptionPane.showMessageDialog(null, "É igual ignorando maiúsculas e minúsculas ");}
```

<strong>05-Exemplo Classe JAVA com atributos e método – Nesse exemplo é exibida a classe Conta com os atributos: saldo, numero, agencia, dono.</strong>
```
public class Conta{
    //Atributos
    private double saldo;
    private int numero;
    private int agencia;
    private String dono;
   //método
    public double getSaldo(){
        return saldo;    }}	06- Exemplo Comentários e iteradores
// comentário de linha
/*Comentário de Bloco*/
//Iteradores
//Imprime no console o índice de 0 a 10
for(int indice=0;indice <= 10; indice++){
    System.out.println("Indice:" + indice);
}
Int indiceWhile=0;
while(indiceWhile <= 10){
    System.out.println("Indice:" + indiceWhile);
    indiceWhile++;
	}	
```

<strong>06- Exemplo Comentários e iteradores</strong>
```
// comentário de linha
/*Comentário de Bloco*/
//Iteradores
//Imprime no console o índice de 0 a 10
for(int indice=0;indice <= 10; indice++){
    System.out.println("Indice:" + indice);
}
Int indiceWhile=0;
while(indiceWhile <= 10)
	{
    System.out.println("Indice:" + indiceWhile);
    indiceWhile++;
	}
```
	<strong>07-Exemplo ArrayList</strong>
```
//para importa o ArrayList 
import java.util.ArrayList;
//declarando um ArrayList de clientes
ArrayList listaClientes = new ArrayList();
//adicionado um elemento ao ArrayList
listaClientes.add("Joao");
//pegando um elemento do ArrayList
listaClientes.get(0);//retorna Joao
//percorrendo o ArrayList
for(int indice=0;indice<listaClientes.size();indice++){
     System.out.println(listaClientes.get(indice));
}	
```
<strong>08-Exemplo HashMap</strong>
```
//para importa o HashMap e Iterator depois do nome do pacote
//import java.util.Iterator;
//import java.util.HashMap;
//declarando um HashMap de placas de carros
HashMap placasCarros = new HashMap();
//adicionado um elemento ao HashMap
placasCarros.put("MPV0001" , "Fiat Palio");
//pegando um elemento do HashMap
placasCarros.get("MPV0001");//retorna Fiat Palio
//percorrendo o HashMap placasCarros
Iterator listaPlacas = placasCarros.keySet().iterator();
while(listaPlacas.hasNext()){    
    Object chave = listaPlacas.next();
    System.out.println(placasCarros.get(chave));
}
```
<strong>09-Exemplo Exception  - São utilizados para tratamento de erros</strong>
```
int[] numeros = new int[10];
try {
  for (int i = 0; i <= 15; i++) {
    numeros[i] = i;      
    System.out.println(i);
  }
} catch (Exception e) {
  e.printStackTrace();
}	
```
<strong>10-Exemplo Herança JAVA – Nesse exemplo ContaPoupanca herda de Conta. ContaPoupança tem um atributo rendimento.</strong>
```
public class ContaPoupanca extends Conta{
    //Atributo rendimento
    private double rendimento = 0.06;
   //método
    public double calculaRendimento(){
        return getSaldo() * rendimento;
    }
}
```
<strong>11- Exemplo interface – Uma interface define um contrato que deve ser implementado por uma classe, ou seja, ela deve obrigatoriamente implementar os métodos definidos na interface.</strong>
```
public interface ContaInterface{
  public double saldo();
}
public class Conta implements ContaInterface{
   int saldo;
 
 public double saldo(){
     return this.saldo;
  }  
}	
```