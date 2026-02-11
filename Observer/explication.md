# Observer

## 🎯 Problème qu’il résout

Dans de nombreux systèmes, un objet doit informer d’autres objets lorsqu’un événement se produit ou lorsque son état change.

Sans pattern adapté, cela entraîne :

- un couplage fort entre objets
- des appels directs multiples
- une logique de notification dispersée
- un code difficile à maintenir

Si l’objet principal connaît explicitement tous ses dépendants, il devient rigide et difficile à faire évoluer.

Observer permet de découpler ces objets.

---

## 🧠 Principe de fonctionnement

Le pattern repose sur deux rôles principaux :

- **Subject (Observable)** : objet qui possède un état
- **Observer** : objet qui souhaite être informé des changements

Les Observers s’abonnent au Subject.

Lorsque l’état du Subject change :

1. Il parcourt la liste des Observers
2. Il appelle une méthode de notification
3. Chaque Observer réagit indépendamment

Le Subject ne connaît que l’interface Observer, pas les implémentations concrètes.

---

## 🏗 Structure

### 1️⃣ Observer
Interface déclarant la méthode update().

### 2️⃣ ConcreteObserver
Implémentation concrète réagissant aux notifications.

### 3️⃣ Subject
Interface déclarant :
- attach()
- detach()
- notifyObservers()

### 4️⃣ ConcreteSubject
Implémentation concrète contenant :
- un état interne
- une liste d’observers
- la logique de notification

---

## 🔁 Fonctionnement

1. Les Observers s’enregistrent auprès du Subject.
2. Le Subject change d’état.
3. Le Subject appelle notifyObservers().
4. Chaque Observer reçoit l’information via update().

---

## 📈 Avantages

- Faible couplage entre objets
- Extension facile (ajout de nouveaux observers sans modifier le subject)
- Respect du principe Open/Closed
- Système événementiel simple

---

## ⚠️ Inconvénients

- Ordre de notification non garanti
- Difficulté à tracer la propagation des événements
- Risque de dépendances circulaires si mal conçu

---

## 🧩 Cas d’usage réel

- Systèmes d’événements
- Interfaces graphiques
- Notifications
- Systèmes d’alertes
- Applications temps réel
