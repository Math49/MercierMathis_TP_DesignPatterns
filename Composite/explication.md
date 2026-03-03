# Composite

## 🎯 Problème qu’il résout
Quand on manipule une structure hiérarchique (type arbre), on se retrouve souvent avec :
- des objets “simples” (feuilles)
- des objets “conteneurs” (composites) qui contiennent d’autres objets

Sans Composite, le client doit souvent écrire :
- des `if` pour savoir si c’est une feuille ou un groupe
- du code différent selon le type de nœud
- une logique récursive mélangée au code métier

Résultat :
- code client complexe
- duplication de logique
- ajout de nouveaux types de nœuds plus difficile

Composite simplifie tout en donnant une abstraction unique pour la hiérarchie.

---

## 🧠 Principe de fonctionnement
Le pattern repose sur une interface commune appelée **Component**.

- Les objets simples (**Leaf**) implémentent directement Component.
- Les objets composés (**Composite**) implémentent aussi Component, mais délèguent une partie de leur travail à leurs enfants (eux-mêmes des Component).

Quand le client appelle une opération sur la racine :
- une Leaf exécute l’opération directement
- un Composite exécute l’opération en la propageant à ses enfants (souvent récursivement)

---

## 🏗 Structure (rôles)
- **Component** : interface commune des objets de l’arbre (opérations métier)
- **Leaf** : élément terminal (pas d’enfants)
- **Composite** : conteneur d’enfants (liste de Component) + délégation/récursion
- **Client** : ne manipule que des Component

---

## 📈 Avantages
- ✅ Le client traite feuilles et composites de manière uniforme
- ✅ Simplifie le code client (moins de conditions)
- ✅ Ajout de nouveaux types de nœuds sans casser le client (OCP)
- ✅ Naturel pour représenter des hiérarchies (arbres)

---

## ⚠️ Inconvénients
- ❌ Peut rendre certaines contraintes plus difficiles (ex: “tel composite ne doit contenir que certains types”)
- ❌ Si on met add/remove dans Component : plus simple pour le client, mais moins “type-safe”
- ❌ L’arborescence peut devenir difficile à déboguer si elle est très grande

---

## 🧩 Cas d’usage réel
- Arborescence de fichiers/dossiers
- Menus / sous-menus
- Organisation (entreprise, équipes)
- Facturation en lots (bundle d’items)
- Structure de documents (sections, paragraphes)

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Composite/src/*.java
java Composite/src/Main
```