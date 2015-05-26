Organisation:
CiaohoanG
I.Nous utilisons la conception MVC:

model (modèle de données):
classe Formation : Définir une formation.
classe Module: Définir un module.
classe Seance: Définir une séance.

view (présentation, interface utilisateur):
classe Mainframe: La fenêtre principale de notre programme.(intégrer le panel de      
     planning, les bouttons de gestion de formation et module)
classe CalendrierPanel: Le panel de planning .

controller (logique de contrôle, gestion des événements, synchronisation):
classe FormationFenetre: charger la gestion des événements de synchronisation pour mettre à jour la modèle “Formation” et les synchroniser.
classe ModuleFenetre:charger la gestion des événements de synchronisation pour mettre à jour la modèle “Module” et les synchroniser.

II.La répartition des tâches
-Modélisation du projet.

-Création du  Gestion de version, Création de la conception de projet dans Netbeans.

-Création de Model
	-Création de classe Formation
	-Création de classe Module
	-Création de classe Séance

-Création de TestUnitaire

-Création de View
-Désigner la  fenêtre principale
	-Création de panel planning
		- Création de calendrier
		- 
		
-Création de Controller
	-Création de Panel Formation
	-Création de Panel Module

-Exporter en HTML le planning	
	-Création le fichier model html
	-Associer les variables avec la model



III. Difficultés rencontrées:

1. L’affichage de planning?

-Interface aux attentes




--Interface arrivé:


2. Comment ajouter/supprimer/modifier le table?
solution: table.addRow, removeRow, setValueAt











