# Création d'un Microservice Java Spring Boot avec Firebase

Nous devrons créer un microservice Java Spring Boot qui interagit avec Firebase pour la persistance des données. Le microservice fournira des points de terminaison pour visualiser, mettre à jour et supprimer un profil utilisateur.

## Classes, Fonctions et Méthodes Principales

### 1. UserProfileController.java

Il s'agit de la classe principale du contrôleur qui gérera les requêtes HTTP relatives aux profils d'utilisateurs. Elle aura les méthodes suivantes :

- `getUserProfile()` : Récupère le profil utilisateur de Firebase.
- `updateUserProfile()` : Met à jour le profil utilisateur dans Firebase.
- `deleteUserProfile()` : Supprime le profil utilisateur de Firebase.

### 2. UserProfileService.java

Il s'agit de la classe de service qui contiendra la logique métier pour la gestion des profils d'utilisateurs. Elle aura les méthodes suivantes :

- `getUserProfile()` : Récupère le profil utilisateur de Firebase.
- `updateUserProfile()` : Met à jour le profil utilisateur dans Firebase.
- `deleteUserProfile()` : Supprime le profil utilisateur de Firebase.

### 3. UserProfile.java

Il s'agit de la classe de données qui représentera un profil utilisateur.

### 4. UserProfileRepository.java

Il s'agit de la classe de dépôt qui gérera l'interaction avec Firebase. Elle aura les méthodes suivantes :

- `getUserProfile()` : Récupère le profil utilisateur de Firebase.
- `updateUserProfile()` : Met à jour le profil utilisateur dans Firebase.
- `deleteUserProfile()` : Supprime le profil utilisateur de Firebase.

## Exécution du Projet

Pour exécuter le projet, naviguez vers le répertoire du projet et exécutez les commandes suivantes :

```bash
# Naviguez vers le répertoire du projet
cd ./project-directory

# Si vous utilisez Maven pour gérer les dépendances du projet
mvn clean install

# Si vous utilisez Spring Boot
mvn spring-boot:run
