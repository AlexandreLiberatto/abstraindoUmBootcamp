package abstraindo_um_bootcamp;

public class Bootcamp {

	//Atributos
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Set<Conteudo> conteudos = new HashSet<>();
	private Set<Devs> devs = new HashSet<>();
	
	
	public Bootcamp(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, Set<Conteudo> conteudos,
			Set<Devs> devs) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.conteudos = conteudos;
		this.devs = devs;
	}
	
	 // Método para adicionar conteudos
    public static void adicionarConteudo(Set<Conteudo> conteudos, String conteudo) {
        if (conteudos.add(conteudo)) {
            System.out.println("Elemento '" + conteudo + "' adicionado com sucesso.");
        } else {
            System.out.println("Elemento '" + conteudo + "' já existe no conjunto.");
        }
    }
    
    //Método para listar conteúdo
    public void listarConteúdo(Set<Conteudo> conteudos) {
    	System.out.println("Conteudos do Bootcamp:");
    	for(Conteudo i : conteudos) {
    		System.out.println("- "+ i);
    	}
    }

    // Método para adicionar devs
    public static void adicionarConteudo(Set<Devs> devs, String dev) {
        if (devs.add(dev)) {
            System.out.println("Elemento '" + dev + "' adicionado com sucesso.");
        } else {
            System.out.println("Elemento '" + dev + "' já existe no conjunto.");
        }
    }
    
    //Método para listar devs
    public void listarConteúdo(Set<Devs> devs) {
    	System.out.println("Devs do Bootcamp:");
    	for(Devs i : devs) {
    		System.out.println("- "+ i);
    	}
    }

	//Geters e Seters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}


	public Set<Conteudo> getConteudos() {
		return conteudos;
	}


	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}


	public Set<Devs> getDevs() {
		return devs;
	}


	public void setDevs(Set<Devs> devs) {
		this.devs = devs;
	}
	
	
	
	
}
