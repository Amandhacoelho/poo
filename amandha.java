Pessoa p1 = new Pessoa ();
p1.nome = "maria";
p1.idade = 18; 
p1.sexo = 'F';
p1.cpf = "123.456.789-00";



Pessoa p2 = new ´Pessoa ();
p2.nome = "Joao";
p2.idade = 22;
p2.cpf = 'M'
p2.cpf = "234.567.890-00";


Conta c1 = new Conta ();
c1.numero = "1234-5";
c1.titular = p1; // a Pessoa p1 eh titular desta Conta!
c1.saldo = 100.0;
c1.limite = 200.0;
    
	
Conta c2 = new conta ();
c2.numero = "2345-6"; // esta Conta pertence 'a pessoa p2
c2.titular = p2;
c2.saldo = 150.0;
c2.limite = 200.0;


System.out.println(c1.saldo);
System.out.println(c1.titular.nome);
System.out.println("Saldo da conta " + c2.numero + " ; " +  c2.saldo);

