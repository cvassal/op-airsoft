package fr.airsoft.web.domain;

public class User {

	private Long id;
	
	private String name;
	
	private String pseudo;
	
	private AirsoftField airsoftField;
	
	private AirsoftReplica airsoftReplica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public AirsoftField getAirsoftField() {
		return airsoftField;
	}

	public void setAirsoftField(AirsoftField airsoftField) {
		this.airsoftField = airsoftField;
	}

	public AirsoftReplica getAirsoftReplica() {
		return airsoftReplica;
	}

	public void setAirsoftReplica(AirsoftReplica airsoftReplica) {
		this.airsoftReplica = airsoftReplica;
	}
}
