# Abstract Factory

## 🎯 Problème qu’il résout

Dans certains systèmes, il ne suffit pas de créer un seul objet.

On doit créer plusieurs objets qui :
- appartiennent à la même "famille"
- doivent être compatibles entre eux
- respectent une même configuration ou un même contexte

Si on instancie ces objets directement avec `new`, on risque :

- de mélanger des familles incompatibles
- de dupliquer la logique de sélection
- d’introduire des dépendances fortes vers des classes concrètes

Le système devient fragile et difficile à faire évoluer.

---

## 🧠 Principe de fonctionnement

Le pattern introduit une interface appelée **Abstract Factory**.

Cette interface déclare plusieurs méthodes de création, chacune produisant un type d’objet différent.

Chaque implémentation concrète de cette factory représente une **famille cohérente d’objets**.

Le client ne connaît que :
- l’interface de la factory
- les interfaces des produits

Il ne connaît jamais les classes concrètes.

---

## 🏗 Structure

### 1️⃣ AbstractProductA
Interface d’un premier type de produit.

### 2️⃣ AbstractProductB
Interface d’un second type de produit.

### 3️⃣ ConcreteProductA1 / A2
Implémentations spécifiques d’un produit A.

### 4️⃣ ConcreteProductB1 / B2
Implémentations spécifiques d’un produit B.

### 5️⃣ AbstractFactory
Interface déclarant les méthodes de création :
- createProductA()
- createProductB()

### 6️⃣ ConcreteFactory1 / ConcreteFactory2
Implémentations concrètes produisant des familles compatibles.

---

## 🔁 Fonctionnement

1. Le client reçoit une factory (via configuration ou injection).
2. Il utilise uniquement les méthodes de la factory.
3. Les objets créés appartiennent à la même famille.
4. Le client travaille uniquement avec des abstractions.

---

## 📈 Avantages

- Garantit la compatibilité entre objets.
- Supprime les dépendances aux classes concrètes.
- Facilite le changement complet de configuration.
- Favorise DIP et OCP.

---

## ⚠️ Inconvénients

- Complexité plus élevée.
- Nombre important de classes.
- Difficile d’ajouter un nouveau type de produit (il faut modifier l’interface factory).

---

## 🧩 Quand l’utiliser ?

- Lorsqu’un système doit fonctionner avec plusieurs configurations complètes.
- Lorsqu’on veut isoler totalement la création.
- Lorsqu’on veut garantir la cohérence entre objets créés ensemble.

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac AbstractFactoryMethod/src/*.java
java AbstractFactoryMethod/src/Main
```