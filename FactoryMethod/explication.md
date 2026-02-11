# Factory Method

## 🎯 Problème qu’il résout

Dans une application orientée objet, il est fréquent qu’une classe ait besoin de créer des objets.

Le problème apparaît lorsque :

- La classe instancie directement des classes concrètes (`new ClasseConcrete()`).
- Le type exact d’objet à créer peut varier.
- De nouveaux types doivent être ajoutés régulièrement.
- La logique de création est complexe ou dépend du contexte.

Dans ce cas, la classe devient **fortement couplée** aux classes concrètes qu’elle instancie.


Le Factory Method permet de résoudre ce problème en **séparant la logique de création de la logique métier**.

---

## 🧠 Principe de fonctionnement


Au lieu de créer directement l’objet, la classe définit une **méthode abstraite ou surchargée** responsable de la création de l’objet.

Les sous-classes redéfinissent cette méthode afin de décider quel type concret doit être instancié.

Ainsi :

- La classe principale (appelée *Creator*) contient la logique métier.
- Les sous-classes (appelées *ConcreteCreator*) choisissent le produit concret.

Le code métier dépend uniquement d’une **abstraction (interface ou classe abstraite)**, jamais d’une implémentation concrète.

---

## 🏗 Structure du pattern

Le pattern comporte généralement quatre éléments principaux :

### 1️⃣ Product

Une interface ou classe abstraite représentant le type d’objet à créer.

Elle définit le comportement commun que toutes les implémentations doivent respecter.

---

### 2️⃣ ConcreteProduct

Les différentes implémentations concrètes du Product.

Chaque classe fournit une version spécifique du comportement.

---

### 3️⃣ Creator

Classe abstraite (ou parfois concrète) qui :

- Déclare la Factory Method
- Contient la logique métier utilisant les objets Product
- Ne connaît que l’abstraction Product

Elle peut :

- Déclarer la méthode fabrique comme abstraite
- Fournir une implémentation par défaut

---

### 4️⃣ ConcreteCreator

Sous-classe du Creator qui :

- Implémente la Factory Method
- Choisit quel ConcreteProduct instancier

---

## 🔁 Fonctionnement général

1. Le client instancie un ConcreteCreator.
2. Le client appelle une méthode métier du Creator.
3. Le Creator appelle la Factory Method.
4. La Factory Method retourne un ConcreteProduct.
5. Le Creator utilise le Product sans connaître son type concret.

La création est ainsi **encapsulée** et **décentralisée**.

---

## 📈 Avantages

### ✅ Réduction du couplage
Le code métier dépend d’interfaces, pas d’implémentations.

### ✅ Extension facile
Ajouter un nouveau type nécessite seulement une nouvelle classe.

### ✅ Centralisation de la création
La logique d’instanciation est localisée et contrôlée.

### ✅ Meilleure maintenabilité
Moins de conditions dispersées dans le code.

### ✅ Meilleure testabilité
On peut substituer facilement les produits pour les tests.

---

## ⚠️ Inconvénients

### ❌ Augmentation du nombre de classes
Le pattern introduit une hiérarchie supplémentaire.

### ❌ Complexité accrue
Pour des cas simples, le pattern peut sembler excessif.

### ❌ Risque de mauvaise utilisation
Si la Factory Method contient trop de logique, elle peut devenir un point de complexité.

---

## 🧩 Cas d'usage réel ?

Ce pattern est pertinent lorsque :

- Le type d’objet à créer dépend du contexte.
- Le système doit être extensible.
- On veut éviter les `switch` ou `if` basés sur des types.
- La logique métier doit rester indépendante des implémentations concrètes.

Il est particulièrement adapté dans :

- Les frameworks
- Les bibliothèques extensibles
- Les architectures modulaires
- Les systèmes à plugins

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac FactoryMethod/src/*.java
java FactoryMethod/src/Main
```