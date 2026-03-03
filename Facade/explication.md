# Facade

## 🎯 Problème qu’il résout
Quand un système est composé de plusieurs services/classes et nécessite un ordre d’appels précis,
le code client devient vite :
- long et répétitif,
- difficile à lire,
- fragile (si l’ordre change, on casse le flux),
- très couplé à plein de classes internes.

Facade propose une interface simple qui masque cette complexité.

## 🧠 Principe de fonctionnement
On crée une classe Façade qui :
- possède/instancie les sous-systèmes (services internes),
- orchestre les appels dans le bon ordre,
- expose au client une méthode simple (ex : `creerDossierVente(...)`).

Le client n’utilise plus directement les services internes.

## 🏗 Structure (rôles des classes)
- **Facade** : `DossierVenteFacade`
- **Sous-systèmes** : `ProprietaireService`, `BienService`, `CommissionService`, `ContratService`, `NotificationService`, `ArchiveService`
- **Client** : `Main` (ou un contrôleur)

## 📈 Avantages
- Simplifie l’utilisation d’un système complexe.
- Réduit le couplage (le client dépend surtout de la façade).
- Centralise un workflow métier (ordre d’exécution).

## ⚠️ Inconvénients
- Peut devenir une “classe fourre-tout” si on y met trop de responsabilités.
- Risque de masquer des besoins de découpage plus propre si mal utilisée.

## 🧩 Cas d’usage réel possible
- Création d’un dossier de vente ou de location (vérifs + calculs + documents + notifications).
- Onboarding d’un nouveau client (création compte + email + CRM).
- Publication d’annonce (validation + SEO + publication + marketing).

## Mermaid — structure
```mermaid
classDiagram
    class DossierVenteFacade {
      -ProprietaireService proprietaireService
      -BienService bienService
      -CommissionService commissionService
      -ContratService contratService
      -NotificationService notificationService
      -ArchiveService archiveService
      +DossierVente creerDossierVente(String proprietaireId, String bienId, double prixVente)
    }

    class ProprietaireService
    class BienService
    class CommissionService
    class ContratService
    class NotificationService
    class ArchiveService

    DossierVenteFacade --> ProprietaireService
    DossierVenteFacade --> BienService
    DossierVenteFacade --> CommissionService
    DossierVenteFacade --> ContratService
    DossierVenteFacade --> NotificationService
    DossierVenteFacade --> ArchiveService

    class Main
    Main --> DossierVenteFacade : utilise
```

## Séquence
```mermaid
sequenceDiagram
    participant Client as Main
    participant F as DossierVenteFacade
    participant P as ProprietaireService
    participant B as BienService
    participant C as CommissionService
    participant K as ContratService
    participant N as NotificationService
    participant A as ArchiveService

    Client->>F: creerDossierVente(...)
    F->>P: verifierProprietaire(...)
    F->>B: verifierBien(...)
    F->>C: calculerCommission(...)
    F->>K: genererContrat(...)
    F->>N: envoyerEmail(...)
    F->>A: archiver(...)
    F-->>Client: DossierVente
```

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Facade/src/*.java
java Facade/src/Main
```