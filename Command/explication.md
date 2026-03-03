# Command (Commande)

## 🎯 Problème qu’il résout
Dans un système, on a souvent un objet qui déclenche des actions (ex: bouton, menu, scheduler, API),
et d’autres objets qui savent réellement faire le travail (ex: services métier).

Sans Command, l’objet déclencheur :
- appelle directement des méthodes concrètes
- doit connaître beaucoup de détails (quelle classe, quelle méthode, quels paramètres)
- devient fortement couplé au code métier

Conséquences :
- difficile de changer une action sans modifier l’invoker
- difficile d’ajouter un historique, une file d’attente, des macros
- l’invoker se transforme en gros `if/switch` ou en un “god object”

Le pattern Command découple complètement :
- **le déclenchement** d’une action
- de **l’exécution réelle** de cette action

---

## 🧠 Principe de fonctionnement
Le pattern introduit une interface `Command` avec une méthode (souvent `execute()`).

Chaque action devient une classe :
- `ConcreteCommand` implémente `Command`
- elle contient une référence vers un **Receiver** (récepteur) : l’objet qui sait faire le vrai travail
- `execute()` délègue l’action au Receiver

Un **Invoker** (déclencheur) reçoit des Command et les exécute sans connaître leurs détails :
- il ne dépend que de l’interface `Command`

---

## 🏗 Structure (rôles)
- **Command** : interface avec `execute()` (et parfois `undo()`)
- **ConcreteCommand** : implémente `execute()`, appelle le Receiver
- **Receiver** : contient la logique métier réelle
- **Invoker** : déclenche l’exécution (ex: bouton, file, scheduler)
- **Client** : assemble les objets (crée Receiver + Command + configure Invoker)

---

## 📈 Avantages
- ✅ Découplage invoker ↔ logique métier (DIP)
- ✅ Ajout facile de nouvelles actions (OCP)
- ✅ Possibilité d’historique, file d’attente, planification
- ✅ Macro-commandes (enchaîner plusieurs commandes)
- ✅ Possibilité d’undo/redo (si conçu pour)

---

## ⚠️ Inconvénients
- ❌ Plus de classes (une par action)
- ❌ Peut être trop lourd pour un cas très simple
- ❌ L’undo nécessite de stocker l’état ou une stratégie de compensation

---

## 🧩 Cas d’usage réel
- Menus / boutons UI (actions paramétrables)
- Files de tâches / jobs (exécuter plus tard)
- Historique et annulation (undo/redo)
- Transactions simplifiées via “commandes de compensation”

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Command/src/*.java
java Command/src/Main
```