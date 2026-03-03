# Builder

## 🎯 Problème qu’il résout
Quand on doit créer un objet complexe avec beaucoup de paramètres (dont une partie optionnelle),
les solutions classiques deviennent vite mauvaises :
- constructeur avec beaucoup d’arguments,
- valeurs `null` / `false` partout,
- plusieurs constructeurs surchargés difficiles à maintenir,
- risque d’inverser l’ordre des paramètres.

## 🧠 Principe de fonctionnement
Builder sépare :
- **la construction** d’un objet
- **de sa représentation finale**

On construit l’objet étape par étape via un `Builder` :
- on définit les champs obligatoires
- puis on ajoute les options souhaitées
- et on termine avec `build()` qui retourne l’objet final

Un **Director** peut être utilisé pour fournir des “recettes” de construction (packs métier).

## 🏗 Structure (rôles des classes)
- **Product** : `AnnoncePremium` (objet final)
- **Builder** : `AnnonceBuilder` (définit les étapes)
- **ConcreteBuilder** : `AnnoncePremiumBuilder` (implémente les étapes et construit le produit)
- **Director** : `AnnonceDirector` (propose des packs : Standard / Premium / Ultra)
- **Client** : `Main` (choisit un pack ou construit manuellement)

## 📈 Avantages
- Code de construction lisible et explicite.
- Plus besoin de passer des `null` pour les champs optionnels.
- Permet de garantir un objet final cohérent (validation dans `build()`).
- Favorise la réutilisation via des “recettes” (Director).

## ⚠️ Inconvénients
- Plus de classes à maintenir.
- Surdimensionné si l’objet est simple ou si les options sont rares.

## 🧩 Cas d’usage réel possible
- Création d’une annonce immo avec options marketing.
- Génération de documents complexes (contrat + annexes).
- Construction de requêtes (filtres optionnels).
- Configuration d’un export (format, colonnes, tri, etc.).

## Structure
```mermaid
classDiagram
    class AnnoncePremium {
      -String titre
      -double prix
      -boolean miseEnAvantAccueil
      -boolean photosHD
      -boolean visiteVirtuelle
      -boolean boostReseaux
      -int dureeMiseEnAvantJours
      -boolean banniereSponsorisee
      +String resume()
    }

    class AnnonceBuilder {
      <<interface>>
      +AnnonceBuilder titre(String)
      +AnnonceBuilder prix(double)
      +AnnonceBuilder miseEnAvantAccueil()
      +AnnonceBuilder photosHD()
      +AnnonceBuilder visiteVirtuelle()
      +AnnonceBuilder boostReseaux()
      +AnnonceBuilder dureeMiseEnAvant(int)
      +AnnonceBuilder banniereSponsorisee()
      +AnnoncePremium build()
    }

    class AnnoncePremiumBuilder
    AnnonceBuilder <|.. AnnoncePremiumBuilder
    AnnoncePremiumBuilder ..> AnnoncePremium : construit

    class AnnonceDirector {
      +AnnoncePremium packStandard(String,double)
      +AnnoncePremium packPremium(String,double)
      +AnnoncePremium packUltra(String,double)
    }

    AnnonceDirector --> AnnonceBuilder : utilise
```

## Séquence (pack Premium)
```mermaid
sequenceDiagram
    participant Client as Main
    participant D as AnnonceDirector
    participant B as AnnoncePremiumBuilder
    participant P as AnnoncePremium

    Client->>D: packPremium(titre, prix)
    D->>B: titre(...)
    D->>B: prix(...)
    D->>B: photosHD()
    D->>B: boostReseaux()
    D->>B: dureeMiseEnAvant(14)
    D->>B: build()
    B-->>D: P
    D-->>Client: P
```

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Builder/src/*.java
java Builder/src/Main
```