# Decorator

## 🎯 Problème qu’il résout
Dans une application, on veut souvent enrichir un objet avec des options.

Une première approche classique consiste à créer une sous-classe par combinaison :
- ClasseDeBase
- ClasseDeBaseOptionA
- ClasseDeBaseOptionB
- ClasseDeBaseOptionAOptionB
- etc.

Problèmes :
- explosion du nombre de classes (une classe par combinaison)
- rigidité : changer une option implique de toucher à l’héritage
- impossible (ou très lourd) de composer les comportements à l’exécution

Decorator évite cela en permettant d’**empiler** des fonctionnalités par composition.

---

## 🧠 Principe de fonctionnement

- le client manipule toujours une même abstraction
- l’objet décoré peut être “enveloppé” par un ou plusieurs décorateurs
- chaque décorateur ajoute un comportement avant/après (ou en plus) du comportement existant

On obtient une composition **flexible** et **dynamique**.

---

## 🏗 Structure
- **Component** : interface commune (contrat des méthodes)
- **ConcreteComponent** : objet de base
- **Decorator** : classe abstraite qui contient une référence vers un Component
- **ConcreteDecorators** : décorateurs concrets ajoutant chacun une responsabilité

---

## 📈 Avantages
- ✅ Ajout de fonctionnalités sans modifier la classe (OCP)
- ✅ Évite l’explosion des sous-classes
- ✅ Composition flexible (ordre des décorateurs possible)
- ✅ Chaque option reste isolée et testable

---

## ⚠️ Inconvénients
- ❌ Multiplie le nombre d’objets (empilement)
- ❌ Peut rendre le débogage moins évident (chaîne de décorateurs)
- ❌ L’ordre des décorateurs peut impacter le résultat (à documenter)

---

## 🧩 Cas d’usage réel possible
- Ajout d’options sur un produit/service (sans multiplier les classes)
- Construction de textes/documents (formatage, ajout de sections)
- Middleware / pipeline (traitements successifs)
- Streams I/O (ex: Java I/O : BufferedInputStream, DataInputStream…)
  
---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Decorator/src/*.java
java Decorator/src/Main
```