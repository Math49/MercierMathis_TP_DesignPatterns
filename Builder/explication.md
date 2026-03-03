# Builder (Monteur)

## 📌 Nom du pattern
**Builder** (ou *Monteur*).

Pattern de création qui permet de construire des objets complexes **étape par étape**.  
Il permet aussi de produire **différentes variantes** d’un même objet en réutilisant un processus de construction. :contentReference[oaicite:1]{index=1}

---

## 🎯 Problème qu’il résout
Certains objets sont "complexes" à instancier :
- beaucoup de champs (dont beaucoup optionnels)
- des sous-objets imbriqués
- des règles de cohérence entre champs

Sans Builder, on se retrouve souvent avec :
- un **constructeur géant** rempli de paramètres (difficile à lire, erreurs faciles)
- ou une multiplication de constructeurs surchargés (*constructeur télescopique*)
- ou une construction dispersée dans le code client (risque d’oublis, incohérences)

Créer une sous-classe par configuration possible ne résout pas le fond du problème, et peut provoquer une explosion du nombre de classes. :contentReference[oaicite:2]{index=2}

---

## 🧠 Principe de fonctionnement
Le pattern propose de **déplacer** la construction de l’objet dans un objet séparé : le **Builder**.

Le Builder expose une série d’étapes (méthodes) :
- chaque méthode configure une partie de l’objet
- le client appelle uniquement les étapes nécessaires

À la fin, on récupère le produit construit via une méthode de type `build()` / `getResult()`.

Le Builder :
- rend la construction **lisible**
- permet de construire des variantes en changeant l’ordre ou les étapes
- empêche souvent l’accès à un objet “à moitié construit” pendant l’assemblage (selon l’implémentation) :contentReference[oaicite:3]{index=3}

---

## 🏗 Structure (rôles)
- **Product** : l’objet final construit (souvent complexe)
- **Builder** : interface (ou classe) décrivant les étapes de construction
- **ConcreteBuilder** : implémentation concrète qui assemble le Product
- **Director** (optionnel) : orchestre l’ordre des étapes pour produire des configurations standardisées  
  Le Director n’est pas obligatoire : le client peut piloter les étapes lui-même. :contentReference[oaicite:4]{index=4}

---

## 📈 Avantages
- ✅ Construction claire et lisible (meilleure que des constructeurs à 10 paramètres)
- ✅ Contrôle des invariants (on peut valider à `build()`)
- ✅ Variantes faciles (mêmes étapes, configurations différentes)
- ✅ Séparation des responsabilités : création ≠ logique métier

---

## ⚠️ Inconvénients
- ❌ Plus de classes (Builder(s), éventuellement Director)
- ❌ Peut sembler “trop” pour des objets simples
- ❌ Si mal fait : duplication entre builders ou API trop verbeuse

---

## 🧩 Cas d’usage réel possible
- Objets avec beaucoup d’options (config, documents, requêtes, commandes)
- Génération de rapports / documents
- Création d’objets immuables avec validation finale
- Construction de structures complexes (ex : payload API, configuration d’export, etc.)

---

## 🔧 Commande à exécuter pour l'exemple

```batch
javac Builder/src/*.java
java Builder/src/Main
```