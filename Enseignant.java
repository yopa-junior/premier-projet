public class Enseignant extends Personne{
    private String nip_e; //nip pour numero d'identification professionnelle    
    private String departement_e; //A quel département de l'universié le prof appartient
    private int bureau_e; //N° du bureau de l'enseignant   

    public Enseignant(String nom,int age,String email,String nip,String departement,int bureau){
        super(nom, age, email);
        this.nip_e=nip;
        this.departement_e=departement;
        this.bureau_e=bureau;
    }

    public String getNip(){
        return this.nip_e;
    }
    public String getDpt(){
        return this.departement_e;
    }
    public int getBur(){
        return this.bureau_e;
    }
    public void setNip(String nip){
        this.nip_e=nip;
    }
    public void setDpt(String departement){
        this.departement_e=departement;
    }
    public void setBur(int bureau){
        this.bureau_e=bureau;
    }
    public void afficherEns(){
        System.out.println("Nom: "+this.nom_p);
        System.out.println("Age: "+this.age_p);
        System.out.println("Adresse Email: "+this.email_p);
        System.out.println("Numéro d'identification professionnelle: "+nip_e+"  Departement d'études: "+departement_e+"  Bureau: Porte "+bureau_e);
    }

}