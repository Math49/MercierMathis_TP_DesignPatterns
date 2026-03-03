# Facade (Façade)

## 🎯 Problème qu’il résout

Dans un système réel, il arrive souvent que le client (le code qui veut faire une action) doive interagir avec **plusieurs classes** d’un sous-système, chacune avec sa propre interface :

- initialiser des objets
- appeler des méthodes dans un certain ordre
- gérer des dépendances
- connaître les détails internes

Cela rend le code client :
- difficile à écrire
- difficile à lire
- fortement couplé aux détails d’implémentation

Facade résout ce problème en **fournissant une interface plus simple**, regroupant les interactions courantes du sous-système et en exposant seulement ce que le client a besoin de connaître. :contentReference[oaicite:1]{index=1}

---

## 🧠 Principe de fonctionnement

Le pattern introduit une **classe Façade** qui :

- encapsule un ensemble de classes complexes (le sous-système)
- offre des **méthodes simplifiées**
- déléguent les appels au sous-système dans le bon ordre ou avec la bonne logique

Le client n’interagit qu’avec la Façade ; il n’a jamais besoin d’appeler directement les classes internes.

---

## 🏗 Structure (rôles)

- **Facade** : classe offrant une interface simple  
- **Subsystem classes** : classes internes avec des interfaces détaillées  
- **Client** : utilise la façade plutôt que le système complexe

---

## 📈 Avantages

- ✅ Masque la complexité interne  
- ✅ Réduit les dépendances du client au sous-système  
- ✅ Facilite la lecture et la maintenance  
- ✅ Permet de modifier le sous-système sans impacter le client  

---

## ⚠️ Inconvénients

- ❌ Ne réduit pas réellement la complexité interne  
- ❌ Peut devenir une “classe passe-plat” si trop de méthodes y sont mises  

---

## 🧩 Cas d’usage

- Simplifier l’accès à une API ou une bibliothèque complexe  
- Regrouper plusieurs services dans une seule interface  
- Fourni un point d’entrée unique dans un sous-système interne  
- Masquer des dépendances et réduire le couplage

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Facade/src/*.java
java Facade/src/Main
```