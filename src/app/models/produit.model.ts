export class Produit {
    
    public produit_id!: number;
    public libele1!: string;
    public description!: string;
    public prix!: number;
    public image!: string;
    public categorie!: {
        categorie_id: number;
        libele2: string
  }


}