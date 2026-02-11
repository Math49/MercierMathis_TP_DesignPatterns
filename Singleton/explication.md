# Singleton

## 🎯 Problème qu’il résout

Dans certaines situations, il est essentiel qu’une classe :

- ne soit instanciée qu’une seule fois
- fournisse un accès global et contrôlé à cette instance

Exemples typiques :
- gestion de configuration
- gestion de logs
- gestion de connexion à une base de données
- cache global
- gestionnaire centralisé

Si on permet plusieurs instanciations :
- incohérence d’état
- conflits de configuration
- consommation inutile de ressources
- comportement imprévisible

Le Singleton impose donc l’unicité.

---

## 🧠 Principe de fonctionnement

Le principe repose sur trois éléments :

1️⃣ Le constructeur est privé  
→ Empêche l’instanciation externe.

2️⃣ Une variable statique privée contient l’unique instance.

3️⃣ Une méthode publique statique permet d’accéder à l’instance.

L’instance peut être :

- créée immédiatement (eager initialization)
- créée au premier appel (lazy initialization)

---

## 🏗 Structure

Classe Singleton contenant :

- un attribut statique privé : instance
- un constructeur privé
- une méthode statique publique : getInstance()

---

## 🔁 Fonctionnement

1. Le client appelle getInstance()
2. Si l’instance n’existe pas, elle est créée
3. La même instance est retournée à chaque appel

Ainsi, toutes les parties du programme partagent le même objet.

---

## 📈 Avantages

- Contrôle strict du nombre d’instances
- Point d’accès global
- Centralisation d’un état partagé
- Économie de ressources

---

## ⚠️ Inconvénients

- Introduit un état global (peut compliquer les tests)
- Peut violer le principe de responsabilité unique
- Peut masquer une mauvaise conception
- Difficile à mocker en tests unitaires

---

## 🧩 Quand l’utiliser ?

Lorsque :
- Une seule instance est nécessaire
- Cette instance doit être partagée
- L’objet représente une ressource unique

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Singleton/src/*.java
java Singleton/src/Main
```