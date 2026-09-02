// Construtor 1: Com parâmetros para inicialização
    public Conta(String nome_titular, int numero, double saldo, double valor){
        this.nome_titular = nome_titular;
        this.numero = numero;
        this.saldo = saldo;
        this.valor = valor;
     };
    
    // Construtor 2: Sem parâmetros (Construtor Padrão)
    public Conta(){
		    this.nome_titular = "Desconhecido";
		    this.numero = 0;
		    this.saldo = 0;
		    this.valor = 0;
    
    }
    // Construtor 3: Recebendo apenas um argumento
    public Conta (String nome_titular){
		    this.nome_titular = nome_titular;
		    this.numero = 10;
		    this.saldo = 50;
		    this.valor = 0;
    }
    
    //Chamando Construtores
    Conta c1 = new Conta("Pedro Ayres", 10, 500, 0);
    // O contrutor e reconhecido pelo argumento do parametro.
