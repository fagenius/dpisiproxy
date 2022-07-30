# dpisiproxy
Le disign pattern proxy
 Permet de fournir un substitut pour un autre objet afin de contrôler l'accès à celui-ci
 
Motivations
 Le sujet réel est distant
 Le sujet réel est trop couyeux à maintenir en mémoire
 
 @Permet la mise en place d'un espace de sotckag temporaire pour conserver des résultats de requête fréquement effectées.
Problème
 Un système effectue des opérations coûteuses en temps dont le résultat est constant dans le temps
 On veut pouvoir conserver les résultats des requêtes précédemment effectées afinde ne pas avoir à refaire les calculs.
Lors d'appels de m"thodes
 Si la requêteà déjà été traitée et que le proxy a conservé le résultat, il renvoi le résultat précédent
Sinon, il redirige l'appel vers le sujet réel 
