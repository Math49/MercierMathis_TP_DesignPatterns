# Adapter

## 🎯 Problème qu’il résout

Dans une application, il arrive souvent qu’on doive utiliser une classe existante :

- provenant d’une bibliothèque externe
- d’un ancien système
- d’un module legacy
- d’un service tiers

Le problème apparaît lorsque son interface ne correspond pas à celle attendue par notre système.

On ne peut pas :
- modifier la classe existante
- casser l’architecture actuelle
- adapter tout le système à cette nouvelle interface

L’Adapter permet de rendre deux interfaces compatibles sans modifier leur code.

---

## 🧠 Principe de fonctionnement

Le client travaille avec une interface cible.
L’Adapter implémente cette interface cible et encapsule l’objet incompatible.

Lorsque le client appelle une méthode :
- l’Adapter reçoit l’appel
- il le transforme
- il appelle la méthode correspondante de l’objet adapté

---

## 🏗 Structure

### 1️⃣ Target
Interface attendue par le client.

### 2️⃣ Adaptee
Classe existante incompatible.

### 3️⃣ Adapter
Classe qui :
- implémente Target
- contient une instance de Adaptee
- traduit les appels

---

## 🔁 Fonctionnement

Client → Target (interface)  
Adapter → implémente Target  
Adapter → appelle Adaptee  

Le client ne sait pas qu’il utilise un adaptateur.

---

## 📈 Avantages

- Réutilisation de code existant
- Faible couplage
- Respect du principe Open/Closed
- Pas besoin de modifier le code legacy

---

## ⚠️ Inconvénients

- Ajoute une couche supplémentaire
- Peut complexifier la compréhension
- Ne corrige pas les problèmes de conception du système existant

---

## 🧩 Quand l’utiliser ?

- Intégration d’un système externe
- Migration progressive d’un ancien système
- Compatibilité entre deux modules
- API incompatible avec l’architecture actuelle

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Adapter/src/*.java
java Adapter/src/Main
```