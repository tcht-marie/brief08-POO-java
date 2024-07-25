# brief08-POO-java
# brief09-mermaid-uml

```mermaid
---
titre: Nebula Game Labs
---

sequenceDiagram
    actor Villageois
    participant RessourcesTypes
    
    Villageois->>RessourcesTypes : récolte des ressources
    
    participant Village
    Villageois->>Village : ramène les ressources
    
    participant MurDefense
    Villageois->>MurDefense : termine la construction grâce aux ressources
    
    participant Maison
    Villageois->>Maison : se repose dans sa maison
    
    box rgb(153,0,0) SoldatsEnnemis
    actor Soldat1
    actor Soldat2
    actor Soldat3
    end
    Soldat1-->>Village : ils attaquent le village
    Soldat2-->>Village : ils attaquent le village
    Soldat3-->>Village : ils attaquent le village
    
    Soldat1-->>MurDefense : détruit le mur de défense
    Soldat2-->>MurDefense : détruit le mur de défense
    Soldat3-->>MurDefense : détruit le mur de défense

```