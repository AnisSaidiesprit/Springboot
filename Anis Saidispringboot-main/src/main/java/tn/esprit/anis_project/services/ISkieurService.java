package tn.esprit.anis_project.services;

import tn.esprit.anis_project.entities.Skieur;

import java.util.List;

public interface ISkieurService {

    public Skieur addSkieur(Skieur skieur);
    public List<Skieur> getAll();
    public Skieur getSkieurById(Long id);

    public void deleteSkieurById(Long id);

    public Skieur updateSkieur(Long id);

    public Skieur getSkieurByNomSAndPrenomS(String nom,String prenom);
}
